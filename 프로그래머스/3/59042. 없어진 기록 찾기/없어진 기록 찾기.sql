-- 코드를 입력하세요
-- ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블
    -- 동물의 아이디*, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부
-- ANIMAL_OUTS 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블
    -- 동물의 아이디*, 생물 종, 입양일, 이름, 성별 및 중성화 여부
-- ANIMAL_OUTS 테이블의 ANIMAL_ID는 ANIMAL_INS의 ANIMAL_ID의 외래 키

-- 입양을 간 기록은 있는데, 보호소에 들어온 기록이 없는 동물
-- 동물의 ID와 이름을 ID 순으로 조회
SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_OUTS O
LEFT JOIN ANIMAL_INS I
ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.ANIMAL_ID IS NULL
ORDER BY O.ANIMAL_ID ASC;