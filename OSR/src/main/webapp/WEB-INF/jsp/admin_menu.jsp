<html >
<head>
    <meta charset="UTF-8">
    <title>CSS vertical menu + submenu</title>
    <style>
        html, body {
            font-family: Arial, Helvetica, sans-serif;
        }

        .navigation {
            width: 100%;
        }

        .mainmenu, .submenu {
            list-style: none;
            padding: 0;
            margin: 0;
        }

        /* make ALL links (main and submenu) have padding and background color */
        .mainmenu a {
            display: block;
            background-color: #CCC;
            text-decoration: none;
            padding: 10px;
            color: #000;
        }

        /* add hover behaviour */
        .mainmenu a:hover {
            background-color: #C5C5C5;
        }


        .mainmenu li:hover .submenu {
            display: block;
            max-height: 200px;
        }


        .submenu a {
            background-color: #999;
        }

        .submenu a:hover {
            background-color: #666;
        }

        .submenu {
            overflow: hidden;
            max-height: 0;
            -webkit-transition: all 0.5s ease-out;
        }
        .submit{padding: 5px;
            margin-left: 38%;
            margin-top: 9px;}
        input[type=text], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        textarea {
            width: 100%;
            height: 150px;
            padding: 12px 20px;
            box-sizing: border-box;
            border: 2px solid #ccc;
            border-radius: 4px;
            background-color: #f8f8f8;
            resize: none;
        }

        input[type=submit]:hover {
            background-color: #45a049;
        }

        .form_div {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
        }

        .action_div{
            float: left;
            background-color: gainsboro;
            width: 87%;
            height: 100%;
            margin-left: 1%;
        }
    </style>
</head>

<body>
<nav class="navigation">
    <ul class="mainmenu">
        <li><a href="/home/">Home</a></li>
        <li><a href="#">Employee</a>
            <ul class="submenu">
                <li><a href="/employees/create">Add Employee</a></li>
                <li><a href="/employees/list">List Employee</a></li>
            </ul>
        </li>
        <li><a href="#">Department</a>
            <ul class="submenu">
                <li><a href="/departments/create">Add Department</a></li>
                <li><a href="/departments/list">List Department</a></li>
            </ul>
        </li>
        <li><a href="#">Course</a>
            <ul class="submenu">
                <li><a href="/courses/create">Add Course</a></li>
                <li><a href="/courses/list">List Course</a></li>
            </ul>
        </li>
        <li><a href="/login/logout">Logout</a></li>
    </ul>
</nav>


</body>
</html>