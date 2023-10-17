-- 코드를 입력하세요
-- 어느 의류 쇼핑몰에 가입한 회원 정보를 담은 USER_INFO 테이블
    --  회원 ID*, 성별, 나이, 가입일
    -- GENDER 컬럼은 비어있거나 0 또는 1의 값, 0인 경우 남자를, 1인 경우는 여자
-- 온라인 상품 판매 정보를 담은 ONLINE_SALE 테이블
    -- 온라인 상품 판매 ID, 회원 ID*, 상품 ID, 판매량, 판매일
-- *동일한 날짜, 회원 ID, 상품 ID 조합에 대해서는 하나의 판매 데이터만 존재합니다.

-- 년, 월, 성별 별로 상품을 구매한 회원수를 집계하는 SQL문을 작성
-- 결과는 년, 월, 성별을 기준으로 오름차순 정렬
-- 성별 정보가 없는 경우 결과에서 제외
    -- WHERE GENDER IS NOT NULL 하면 되겠따

SELECT TO_CHAR(O.SALES_DATE, 'YYYY') AS YEAR,
       TO_NUMBER(TO_CHAR(O.SALES_DATE, 'MM')) AS MONTH,
       U.GENDER,
       COUNT(DISTINCT O.USER_ID) AS USERS
FROM ONLINE_SALE O
JOIN USER_INFO U
ON O.USER_ID = U.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY TO_CHAR(O.SALES_DATE, 'YYYY'),
         TO_CHAR(O.SALES_DATE, 'MM'),
         U.GENDER
ORDER BY YEAR, MONTH, U.GENDER