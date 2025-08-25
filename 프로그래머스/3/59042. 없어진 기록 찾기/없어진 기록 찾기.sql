-- 입양간 기록은있는데 보호소들어온기록은 없는 동물
SELECT R.ANIMAL_ID, R.NAME
from ANIMAL_INS L
right join animal_outs R
on L.ANIMAL_ID = R.ANIMAL_ID
where L.ANIMAL_ID IS NULL
order by R.ANIMAL_ID