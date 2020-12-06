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
    <h2>Registration Form</h2>
</div>
<div align="center">
    <form method="post" action="/saveStudent">
        <p>Enter Student Name: <input type="text" name="sname"></p>
        <p>Enter Student RollNo: <input type="text" name="rollno"></p>
        <p>Enter Student Gender:
            <input type="radio" id="male" name="gender" value="male">
            <label for="male">Male</label><br>
            <input type="radio" id="female" name="gender" value="female">
            <label for="female">Female</label><br></p>
        <p><label for="birthdate">Date Of Birth:</label>
            <input type="date" id="birthdate" name="dob"></p>
        <p><label for="class">Choose a Class:</label>
        <select name="className" id="class">
            <option value=1>Class 11</option>
            <option value=2>Class 12</option>
        </select></p>
        <p>Enter Student School: <input type="text" name="school"></p>
        <input type="submit" value="Register">
    </form>
</div>
</body>
</html>