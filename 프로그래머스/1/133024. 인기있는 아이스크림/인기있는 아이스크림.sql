-- 조회 컬림: 아스크림 맛 FLAVOR
-- 조회조건: 총주문량 기준 내림차순 , 출하번호 기준 오름차순
SELECT FLAVOR
FROM FIRST_HALF
order by total_order desc,
        shipment_id asc;