# Write your MySQL query statement below
select a1.machine_id , ROUND(ABS(AVG(a1.timestamp-a2.timestamp)),3) as processing_time
from Activity a1
join Activity a2 on a1.machine_id=a2.machine_id
where a1.activity_type = 'start' and a2.activity_type = 'end'
group by machine_id;