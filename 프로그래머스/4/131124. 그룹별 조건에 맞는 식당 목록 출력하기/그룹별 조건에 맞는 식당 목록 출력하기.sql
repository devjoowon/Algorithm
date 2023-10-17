-- 코드를 입력하세요
-- 고객의 정보를 담은 MEMBER_PROFILE 테이블
    -- 회원 ID*, 회원 이름, 회원 연락처, 성별, 생년월일
-- 식당의 리뷰 정보를 담은 REST_REVIEW 테이블
    -- 리뷰 ID, 식당 ID, 회원 ID*, 점수, 리뷰 텍스트, 리뷰 작성일

--  리뷰를 가장 많이 작성한 회원의 리뷰들을 조회
-- 회원 이름, 리뷰 텍스트, 리뷰 작성일이 출력되도록 작성
-- 결과는 리뷰 작성일을 기준으로 오름차순, 리뷰 작성일이 같다면 리뷰 텍스트를 기준으로 오름차순

-- 유저ID 및 유저별 리뷰 수를 구하는 쿼리
-- WITH REVIEW_CNT AS (
-- SELECT MEMBER_ID, COUNT(*) AS CNT
-- FROM REST_REVIEW
-- GROUP BY MEMBER_ID)

-- 최대 리뷰 수를 구하는 쿼리
-- WITH REVIEW_MAX_CNT AS (
-- SELECT MAX(COUNT(*)) AS MAXCNT
-- FROM REST_REVIEW
-- GROUP BY MEMBER_ID)

SELECT M.MEMBER_NAME, R.REVIEW_TEXT, TO_CHAR(R.REVIEW_DATE, 'YYYY-MM-DD') AS REVIEW_DATE
FROM MEMBER_PROFILE M
JOIN REST_REVIEW R
ON M.MEMBER_ID = R.MEMBER_ID
WHERE M.MEMBER_ID IN (SELECT MEMBER_ID
                      FROM (SELECT MEMBER_ID, COUNT(*) AS CNT
                            FROM REST_REVIEW
                            GROUP BY MEMBER_ID)
                      WHERE CNT = (SELECT MAX(COUNT(*)) AS MAXCNT
                                    FROM REST_REVIEW
                                    GROUP BY MEMBER_ID)
                      )
ORDER BY R.REVIEW_DATE, R.REVIEW_TEXT;