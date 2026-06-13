select a.machine_id , round(avg(b.timestamp-a.timestamp),3) as processing_time from Activity a
join Activity b
ON a.machine_id = b.machine_id
and a.process_id = b.process_id
and b.activity_type = 'end'
and a.activity_type= 'start'
group by a.machine_id
