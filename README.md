# Data-Structure with Algorithm 

✔ 데이터 구조(Data Structure)란?

  데이터 항목들 사이의 배열과 접근 관계를 논리적 관점에서 나타낸 구조. 선형 구조, 트리 구조, 네트워크 구조로 나뉘는 것.
  
  * 데이터 구조의 종류
    1) 리스트(List) - 각 데이터를 연이어 저장하는 기술
    2) 연결 리스트(Linked List) - 각 데이터를 랜덤 위치에 저장하고 그 데이터를 연결하는 기술 

✔ 알고리즘(Algorithm)이란?
  
  주어진 문제를 해결하기 위한 절차로 정해진 입력에 정해진 출력이 나와야 하고, 무한히 반복되어서는 안되는 것
  
  * 알고리즘의 종류
    1) 정렬(Sorting) - 한 줄려 모여 있는 데이터를 순서대로 나열하는 방법
    2) 검색(Searching) - 데이터 중에서 원하는 것을 찾아 내는 방법
    3) 문자열 패턴 패칭(SPM: String Pattern Matching) - 주어진 문자열에서 찾고자하는 문자열과 일치하는 부분을 찾아내는 방법
    

🔴 ArrayList: 배열 기반; 데이터의 추가와 삭제에 불리함. 단, 순차적인 추가 및 삭제는 가장 빠름. 랜덤 요소에 대한 접근성이 뛰어나다.

🟠 LinkedList: 연결 기반; 데이터의 추가와 삭제에 유리함. 랜덤 요소에 대한 접근성이 좋지 않음.

🟡 HashMap: 배열과 연결이 결합된 형태. 추가, 삭제, 검색, 접근성 모두 뛰어남. 검색에 있어서 최고성능 > HashSet이 HashMap을 이용해 구현될 수 있음

🟢 TreeMap: 연결 기반; 정렬과 검색(특히 범위검색)에 적합. 다만, 검색 부분에 있어서 HashMap을 따라가진 못함. > TreeSet이 TreeMap을 이용해 구현될 수 있음

🔵 Stack: Vector를 상속 받아 구현 (더이상 vector 지원X) LIFO (Last in First Out)

🟣 Queue: LinkedList가 Queue 인터페이스를 구현함.

