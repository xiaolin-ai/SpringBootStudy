<!DOCTYPE html>
<html>
    <head lang="en">
        <meta charset="UTF-8"/>
        <title>freemarker</title>
    </head>
    <body>
        Hi FreeMarker. 现在时间是 ${now}<br/>
        ${"Hi FreeMarker. 现在时间是 ${now} !"}<br/>
        ${"Hi FreeMarker. 现在时间是 " + now+ " !"}
    </body>
</html>