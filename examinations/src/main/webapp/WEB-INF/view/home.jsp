<html>
<head>
    <style>
        body, title {
            background-color: aliceblue;
        }

         * {box-sizing: border-box}
        body {font-family: Arial, Helvetica, sans-serif;}

        .navbar {
            width: 100%;
            background-color: #555;
            overflow: auto;
        }

        .navbar a {
            float: left;
            padding: 12px;
            color: white;
            text-decoration: none;
            font-size: 17px;
            width: 25%; /* Four links of equal widths */
            text-align: center;
        }

        .navbar a:hover {
            background-color: #000;
        }

        .navbar a.active {
            background-color: #4CAF50;
        }

        @media screen and (max-width: 500px) {
            .navbar a {
                float: none;
                display: block;
                width: 100%;
                text-align: left;
            }
        }
    </style>
    <title>Register of Students</title>
</head>
<body>
<div align="center">
    <h2>Welcome to Student Registration</h2><br/>
</div>

<div class="navbar">
    <a class="active" href="/">Home</a>
    <a href="/addClass">Class</a>
    <a href="/addStudent">Student</a>
    <a href="/addSubject">Subject</a>
    <a href="/addExam">Exam</a>
    <a href="/studentList">Student List</a>
    <a href="/addTimeTable">Exam TimeTable</a>
    <a href="/getJoinExamSubject">Join tables</a>
</div>
</body>
</html>