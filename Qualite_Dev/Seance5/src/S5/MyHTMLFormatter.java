package S5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

    class MyHTMLFormatter extends Formatter {
        // this method is called for every log records
        public String format(LogRecord rec) {
            StringBuffer buf = new StringBuffer(1000);
            buf.append("<div class=card> <header style=color:red>"+rec.getLevel()+"</header>");
            buf.append("<div>"+rec.getMessage()+ "");
            buf.append("<div style=color:blue>" +calcDate(rec.getMillis())+"</div></div></div>");
            

            return buf.toString();
        }


        private String calcDate(long millisecs) {
            SimpleDateFormat date_format = new SimpleDateFormat("MM/dd, yyyy HH:mm");
            Date resultdate = new Date(millisecs);
            return date_format.format(resultdate);
        }

        // this method is called just after the handler using this
        // formatter is created
        public String getHead(Handler h) {
            return "<!DOCTYPE html>\n<head>\n"
                    + "<style>"
                    +".card {\n" +
                    "            border: solid 1px black;\n" +
                    "            margin: 5px 5px 5px 5px;\n" +
                    "        }"
                    + "</style>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "<h1>" + (new Date()) + "</h1>\n"
                    + "<section border=\"1\" >\n";
        }

        // this method is called just after the handler using this
        // formatter is closed
        public String getTail(Handler h) {
            return "</section>\n</body>\n</html>";
        }
    }