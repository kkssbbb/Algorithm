-- 
SELECT f.FLAVOR from FIRST_HALF f
join ICECREAM_INFO i on f.FLAVOR = i.FLAVOR 
and f.total_order >= 3000
and i.ingredient_type = 'fruit_based'
