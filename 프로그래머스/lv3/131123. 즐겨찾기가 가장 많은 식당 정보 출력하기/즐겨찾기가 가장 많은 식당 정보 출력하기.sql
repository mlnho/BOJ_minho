-- -- -- 코드를 입력하세요
SELECT B.FOOD_TYPE,
        B.REST_ID,
        B.REST_NAME,
        B.FAVORITES
FROM(
SELECT FOOD_TYPE,
        MAX(FAVORITES) AS FAVORITES
from REST_INFO
GROUP BY FOOD_TYPE
) A
LEFT JOIN REST_INFO B
ON A.FOOD_TYPE = B.FOOD_TYPE
WHERE 1=1
AND A.FOOD_TYPE = B.FOOD_TYPE
AND A.favorites = B.favorites
ORDER BY FOOD_TYPE DESC

-- SELECT FOOD_TYPE,
--         MAX(FAVORITES)
-- from REST_INFO
-- GROUP BY FOOD_TYPE



-- select b.FOOD_TYPE,
--         b.REST_ID ,
--         b.REST_NAME,
--         b.FAVORITES
--  from (
--     select distinct(food_type)
--           ,max(favorites) as favorites
--     from rest_info 
--     group by food_type
-- ) a, rest_info b
-- where a.food_type=b.food_type
--   and a.favorites = b.favorites
-- order by food_type desc


-- SELECT *
-- FROM REST_INFO