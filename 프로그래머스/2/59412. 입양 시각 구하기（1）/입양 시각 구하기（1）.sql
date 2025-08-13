-- 코드를 입력하세요
SELECT 
    hour(datetime) as hour,
    COUNT(datetime) AS 'count'
from 
    animal_outs
where
    hour(datetime) between 9 and 19
group by
    hour(datetime)
order by
    1