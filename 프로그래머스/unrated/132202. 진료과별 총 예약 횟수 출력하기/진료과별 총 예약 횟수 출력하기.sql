-- 코드를 입력하세요
-- 2022년 5월 조건
-- 진료과코드(MCDP_CD) 별로.. -> group by
SELECT MCDP_CD AS "진료과코드", COUNT(*) AS "5월예약건수"
FROM APPOINTMENT
WHERE APNT_YMD BETWEEN TO_DATE('2022-05-01','YYYY-MM-DD') AND TO_DATE('2022-05-31','YYYY-MM-DD')
GROUP BY MCDP_CD
ORDER BY COUNT(APNT_NO), MCDP_CD