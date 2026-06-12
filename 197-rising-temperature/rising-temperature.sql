select t1.id 
from Weather as t1, weather as t2
where datediff(t1.recordDate,t2.recordDate)=1 and t1.temperature>t2.temperature;

