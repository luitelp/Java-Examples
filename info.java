//introduction to chpter 4

We have 3 different control structures

1. Sequence Structure
2. Selection Statements

2.1 if statement - single - selection statement
2.2 if...else statemenr - double selection statement
2.3 switch - multiple selection statement

3. Iteration statements
3.1 while
3.2 for
3.3 do...while

2.1 single-selection statement

//pseudocode

if student's grade is less than 60
then print "F"

if (studentsGrade < 60){
	system.out.print ("F");
}

2.2. if...else statement
//pseudocode

if student's grade is greater than or equal to 60
then Print "Passed"
else
	then print "Failed"

if (studentGrade >=60) {
	System.out.print ("Passed");
}
else {
	System.out.print ("Failed");
}


nested if...else statements
//pseudocode

if student's grade is greater than or equal to 90
then print "A"

else 
	if student's grade is greater than or equal to 80
then print "B"

else 
	if student's grade is greater than or equal to 70
then print "C"

else
	if student's grade is greater than or equal to 60
then print "D"
else
	print "F"

if (studentGrade >=90) {
System.out.print ("A"); }

else {
	if (studentGrade >=80) {
	System.out.print ("B"); }
	
	else {
		if (studentGrade >=70) {
		System.out.print ("C"); }
		
		else{
			if (studentGrade >=60) {
			System.out.print ("D"); }
			
			else{
		System.out.print ("F");}
		}
	}
}
		
//SECOND OPTION FOR NESTED IF...ELSE STATEMENT

if (studentsGrade >=90) {
System.out.print ("A"); }

else if (studentsGrade >=80) {
System.out.print ("B"); }

else if (studentsGrade >=70) {
System.out.print ("C"); }
	
else if (studentsGrade >=60) {
System.out.print ("D"); }

else
System.out.print ("F");

//conditional operator

System.out.print (StudentGrade >=60 ? "Passed" : "Failed");
