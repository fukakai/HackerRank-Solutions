select  case when grade < 8 then NULL 
        else name 
        end name, grade, marks
from STUDENTS, GRADES
where marks >= min_mark and marks <= max_mark
order by grade desc, name asc;