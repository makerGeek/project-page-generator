
import java.io.File;

public class Templates {

    public static String generateHtml(String title, String description, File... files) {
        StringBuilder gallery = new StringBuilder();
        for (File file : files) {
            gallery.append(new ImageBlock(file.toString()).getContent());
        }
        return (new Before(title, description).getContent() + gallery.toString() + after);
    }

    static class ImageBlock {

        private String content;

        public ImageBlock(String img) {

            content = " <div class='col-sm-6 col-xs-12 col-md-6 col-lg-6'>\n"
                    + "                    <a class=\"thumbnail fancybox\" rel=\"ligthbox\" href=\"" + img + "\">\n"
                    + "                        <img class=\"img-responsive\" alt=\"\" src=\"" + img + "\"/>\n"
                    + "                    </a>\n"
                    + "                </div> <!-- col-6 / end -->"
                    + ""
                    + "";
        }

        public String getContent() {
            return content;
        }
    }

    static class Before {

        private String content;

        public String getContent() {
            return content;
        }

        public Before(String title, String description) {
            content = "<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "<head>\n"
                    + "    <meta charset=\"utf-8\">\n"
                    + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                    + "    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n"
                    + "    <meta name=\"description\" content=\"\">\n"
                    + "    <meta name=\"author\" content=\"\">\n"
                    + "    <link rel=\"icon\" href=\"https://makergeek.github.io/favicon.ico\">\n"
                    + "\n"
                    + "    <title>" + title + "</title>\n"
                    + "\n"
                    + "\n"
                    + "    <!-- Bootstrap core CSS -->\n"
                    + "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css\"/>\n"
                    + "\n"
                    + "    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n"
                    + "    <link href=\"https://makergeek.github.io/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n"
                    + "\n"
                    + "    <style>\n"
                    + "        body {\n"
                    + "            padding-top: 50px;\n"
                    + "        }\n"
                    + "\n"
                    + "        .starter-template {\n"
                    + "            padding: 40px 15px;\n"
                    + "            text-align: center;\n"
                    + "        }\n"
                    + "        .thumbnail>img {\n"
                    + "            height: 300px;\n"
                    + "        }\n"
                    + "    </style>\n"
                    + "\n"
                    + "</head>\n"
                    + "\n"
                    + "<body>\n"
                    + "\n"
                    + "<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n"
                    + "    <div class=\"container\">\n"
                    + "       <div class=\"navbar-header\">\n"
                    + "            <a class=\"navbar-brand\" href=\"https://makergeek.github.io/#portfolio\"><span\n"
                    + "                    class=\"glyphicon glyphicon-menu-left\"></span> Portfolio</a>\n"
                    + "        </div>"
                    + ""
                    + "    </div>\n"
                    + "</nav>\n"
                    + "\n"
                    + "<div class=\"container\">\n"
                    + "\n"
                    + "    <div class=\"starter-template\">\n"
                    + "        <h1>" + title + "</h1>\n"
                    + "        <p class=\"lead\">" + description + "</p>\n"
                    + "    </div>\n"
                    + "    <div class=\"container\">\n"
                    + "        <div class=\"row\">\n"
                    + "            <div class='list-group gallery'>";

        }

    }

    static String after = "            </div> <!-- list-group / end -->\n"
            + "        </div> <!-- row / end -->\n"
            + "    </div> <!-- container / end -->\n"
            + "\n"
            + "\n"
            + "</div><!-- /.container -->\n"
            + "\n"
            + "\n"
            + "<!-- Bootstrap core JavaScript\n"
            + "================================================== -->\n"
            + "<!-- Placed at the end of the document so the pages load faster -->\n"
            + "<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js\"></script>\n"
            + "<script type=\"text/javascript\"\n"
            + "        src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n"
            + "<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n"
            + "<script src=\"https://makergeek.github.io/js/ie10-viewport-bug-workaround.js\"></script>\n"
            + "</body>\n"
            + "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.css\"/>\n"
            + "<script type=\"text/javascript\"\n"
            + "        src=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.pack.js\"></script>\n"
            + "\n"
            + "<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n"
            + "<!--[if lt IE 9]>\n"
            + "<script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n"
            + "<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n"
            + "<![endif]-->\n"
            + "\n"
            + "<script>\n"
            + "    $(document).ready(function () {\n"
            + "        //FANCYBOX\n"
            + "        //https://github.com/fancyapps/fancyBox\n"
            + "        $(\".fancybox\").fancybox({\n"
            + "            openEffect: \"fade\",\n"
            + "            closeEffect: \"fade\",\n"
            + "            nextEffect: \"none\",\n"
            + "            prevEffect:\"fade\"\n"
            + "        });\n"
            + "    });\n"
            + "\n"
            + "\n"
            + "</script>\n"
            + "\n"
            + "\n"
            + "</html>";
}
