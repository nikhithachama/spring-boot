<!DOCTYPE html>
<html>
<head>
    <style>
        body, title {
            background-color: lightcyan;
        }

        input[type=submit] {
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 16px 32px;
            text-decoration: none;
            margin: 4px 2px;
            cursor: pointer;
        }

    </style>
    <title>
        Class Details
    </title>
</head>
<body>
<div align="center">
    <h2>Class Form</h2>
</div>
<div align="center">
    <form method="post" action="/saveClass">
        <p>Enter Class Name: <input type="text" name="name"></p>
        <p>Enter Class Code: <input type="text" name="classCode"></p>
        <input type="submit" value="Save">
    </form>
</div>
</body>
</html>