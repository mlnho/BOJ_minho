-- 코드를 입력하세요

SELECT A.INGREDIENT_TYPE,
        SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM(
SELECT A.FLAVOR,
        A.TOTAL_ORDER,
        B.INGREDIENT_TYPE
FROM FIRST_HALF A
LEFT JOIN ICECREAM_INFO B
ON A.FLAVOR = B.FLAVOR
) A
GROUP BY A.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC

# SELECT *
# FROM FIRST_HALF 