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
       Time Table
    </title>
</head>
<body>
<div align="center">
    <h2>Exam Time Table</h2>
</div>
<div align="center">
    <form method="post" action="/saveTimeTable">
        <p><label for="class">Choose a Class:</label>
            <select name="name" id="class" >
                <option value="Class 11">Class 11</option>
                <option value="Class 12">Class 12</option>
            </select></p>
        <p><label for="exam">Choose a Exam Type:</label>
            <select name="examType" id="exam">
                <option value=Quarterly>Quarterly</option>
                <option value="Half Yearly">Half Yearly</option>
                <option value=Annually>Annually</option>
            </select></p>
        <p><label>Choose a subject:</label>
            <input type="checkbox" id="subject1" name="subjectName" value="Physics">
            <label for="subject1"> Physics</label><br>
            <input type="checkbox" id="subject2" name="subjectName" value="Chemistry">
            <label for="subject2"> Chemistry</label><br>
            <input type="checkbox" id="subject3" name="subjectName" value="Maths">
            <label for="subject3"> Maths</label><br><br></p>
        <p><label for="exdate">Choose Exam Date:</label>
            <input type="date" id="exdate" name="examDate"></p>
        <p>Enter Exam Start Time:<input type="text"></p>
        <p>Enter Exam End Time:<input type="text"></p>
<%--        <p><label for="start">Choose a  Exam Start Time:</label>--%>
<%--        <input type="time" id="start" name="startTime"--%>
<%--               min="08:00" max="15:00" required></p>--%>
<%--        <p><label for="end">Choose a  Exam End Time:</label>--%>
<%--            <input type="time" id="end" name="endTime"--%>
<%--                   min="11:00" max="18:00" required></p>--%>
        <input type="submit" value="Register">
    </form>
</div>
</body>
</html>