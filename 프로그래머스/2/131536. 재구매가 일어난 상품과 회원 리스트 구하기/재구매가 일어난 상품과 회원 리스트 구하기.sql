-- 컬럼: 재구매한 회원 ID, 재구매한 상품 ID
-- 테이블: ONLINE_SALE
-- 조회 조건: 동일한 회원이 동일한 상품을 재구매한  
-- 정렬 조건: 회원ID 오름차순, 회원ID 같다면 삼품ID 기준 정렬
SELECT USER_ID, PRODUCT_ID as PRODUCT_ID
FROM ONLINE_SALE
group by
    USER_ID,
    PRODUCT_ID
having count(*) >=2
order by
    USER_ID ASC,
    PRODUCT_ID DESC 