-- 코드를 입력하세요
-- PLACES 테이블은 공간 임대 서비스에 등록된 공간의 정보를 담은 테이블
    -- 공간의 아이디(기본키), 이름, 공간을 소유한 유저의 아이디

-- 공간을 둘 이상 등록한 사람을 "헤비 유저"라고 부릅니다.
-- 헤비 유저가 등록한 공간의 정보를 아이디 순으로 조회

SELECT ID, NAME, HOST_ID
FROM PLACES
WHERE HOST_ID IN (SELECT HOST_ID
                    FROM PLACES
                GROUP BY HOST_ID
                  HAVING COUNT(*) >= 2)
ORDER BY ID;

