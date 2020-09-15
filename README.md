# 알고리즘 문제 풀이

* [백준](https://www.acmicpc.net/)과 [프로그래머즈](https://programmers.co.kr/) 사이트에서 풀었던 문제들에 대한 코드를 올려놓은 repository입니다.
  * 코드(이하 솔루션)는 `src` 폴더에서 확인하실 수 있습니다.
    * 백준 문제에 대한 솔루션은 문제 닉네임과 문제 번호가 함께 표기되어 있습니다.
    * 프로그래머즈 문제에 대한 솔루션은 문제 닉네임만 표기되어 있습니다. 이 repository 내에서 따로 분류해야 할 것 같습니다.
    * 모든 솔루션에 대한 언어는 java 입니다.


* 다시 풀어보았으면 좋을 법한 문제들
1. [문자열 압축 (프로그래머즈)](https://programmers.co.kr/learn/courses/30/lessons/60057)
    * 굳이 String을 만들 필요 없이 개수만 계산하면 되는 것임 
    * Git Link
   
2. [숫자 카드2 (백준)] (https://www.acmicpc.net/problem/10816)
    * lower_bound 또는 upper_bound 구현
    * python 으로 시도했는데 TO로 실패함. bisect library 이용해서 풀음.
    
3. [한윤정이 이탈리아에 가서 아이스크림을 사먹는데 (백준)] (https://www.acmicpc.net/problem/2422)
    * 핵심은 배열을 활용하는 것 
        * 금지 조합은 2가지인데, 선택 조합은 3가지
        * 여기서는 선택 조합 보다는 금지 조합에 대한 배열을 만들고, 선택 조합을 금지 조합에 대입시켜보는 것이 맞다.
        * 예) (1,2,3) -> (1,2), (2,3), (1,3) 확인
    * python lib의 itertools combinations는 시간이 너무 오래걸림
    * 다중 for문으로 푸는것이 훨씬 빠름 (약 3배정도)
    
    
* 공부해야할 자료구조 또는 알고리즘
1. Segmentation Tree
2. Trie
3. Union-Find (복습)
