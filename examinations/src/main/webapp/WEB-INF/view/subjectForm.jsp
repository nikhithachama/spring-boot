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
        Students Register
    </title>
</head>
<body>
<div align="center">
    <h2>Subjects Form</h2>
</div>
<div align="center">
    <form method="post" action="/saveSubject">
        <p>Enter Subject Name: <input type="text" name="subjectName"></p>
        <p>Enter Subject Code: <input type="text" name="subjectCode"></p>
        <p><label for="examType">Choose a Exam Type:</label>
            <select name="exam" id="examType">
                <option value=1>Quarterly</option>
                <option value=2>Half Yearly</option>
                <option value=3>Annually</option>
            </select></p>
        <p><label for="class">Choose a Class:</label>
        <select name="className" id="class">
            <option value=1>Class 11</option>
            <option value=2>Class 12</option>
        </select></p>
        <input type="submit" value="Save">
    </form>
</div>
</body>
</html>