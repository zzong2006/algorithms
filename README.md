# 알고리즘 문제 풀이

* [백준](https://www.acmicpc.net/)과 [프로그래머즈](https://programmers.co.kr/) 사이트에서 풀었던 문제들에 대한 코드를 올려놓은 repository입니다.
  * 코드(이하 솔루션)는 `src` 폴더에서 확인하실 수 있습니다.
    * 백준 문제에 대한 솔루션은 문제 닉네임과 문제 번호가 함께 표기되어 있습니다.
    * 프로그래머즈 문제에 대한 솔루션은 문제 닉네임만 표기되어 있습니다. 이 repository 내에서 따로 분류해야 할 것 같습니다.
    * 모든 솔루션에 대한 언어는 java 및 python 입니다.
    * (2020/09/25) 못 풀었지만 생성된 문제에 대한 파일은 `${filename}_(unsolved)` 표시를 하기로 하였습니다. 

## 오답노트: 다시 풀어보았으면 좋을 법한 문제들
1. [문자열 압축 (프로그래머즈)](https://programmers.co.kr/learn/courses/30/lessons/60057)
    * 굳이 String을 만들 필요 없이 개수만 계산하면 되는 것임 
    * Git Link
   
2. [숫자 카드2 (백준)](https://www.acmicpc.net/problem/10816)
    * lower_bound 또는 upper_bound 구현
    * python 으로 시도했는데 TO로 실패함. bisect library 이용해서 풀음.
    
3. [한윤정이 이탈리아에 가서 아이스크림을 사먹는데 (백준)](https://www.acmicpc.net/problem/2422)
    * 핵심은 배열을 활용하는 것 
        * 금지 조합은 2가지인데, 선택 조합은 3가지
        * 여기서는 선택 조합 보다는 금지 조합에 대한 배열을 만들고, 선택 조합을 금지 조합에 대입시켜보는 것이 맞다.
        * 예) (1,2,3) -> (1,2), (2,3), (1,3) 확인
    * python lib의 itertools combinations는 시간이 너무 오래걸림
    * 다중 for문으로 푸는것이 훨씬 빠름 (약 3배정도)

4. [경주로 건설 (프로그래머즈)](https://programmers.co.kr/learn/courses/30/lessons/67259?language=python3)
    * bfs 로 해결하는 것인데, 테스트 케이스가 부족하여서 조금 쉬운 문제가 되버림 (하지만 난 못풀었음)
    * 핵심은 dp도 적절히 섞어줘서 가지치기를 진행하는 것
    * python에서의 상하좌우 이동은 tuple로 해결하는 것이 좋다는 것을 깨달음
    * python에서의 queue는 list 보다는 collections의 deque를 사용하는 것이 좋다는 것을 깨달음

5. [자와 각도기](https://www.acmicpc.net/problem/2916)
    * queue를 이용한 bfs를 쓰면 속도가 늦다
        * 배열과 재귀를 이용한 dfs가 빠름
    * 잡설
        * 풀긴 풀었는데, 힌트를 너무 많이 봤다
        * *자*는 쓰지 않음
        * 각도의 개념을 이해하는게 중요했음
        
6. [사탕 게임](https://www.acmicpc.net/problem/3085) 
    * 구현은 어렵지 않았는데, 경우의 수가 핵심이었다. 
        * 사탕끼리 바꾼 행,열 만 고려해야되는게 아니라, 이미 바꾼 상태에서도 얻을 수 있는 최대값이 다른 어디엔가 존재한다.

7. [Maximum Sum Obtained of Any Permutation (leetcode)](https://leetcode.com/problems/maximum-sum-obtained-of-any-permutation/)
    * 주어진 여러개의 구간들 중 가장 많이 중첩된 순위를 한꺼번에 계산하는법
        * 핵심 : `시작 구간`에는 `1` 그리고 `마지막 구간 + 1` 에는 `-1` 을 놓고(더하고) **굴린다**..!
        
8. [Split a String Into the Max Number of Unique Substrings](https://leetcode.com/contest/weekly-contest-207/problems/split-a-string-into-the-max-number-of-unique-substrings/)
    * 풀긴 풀었는데 재귀로 풀었다가 TLE 나버린 case
        *   Backtracking 솔루션을 보니 훨씬 깔끔했다. 다만 이해하긴 좀 어려웠음.   
        

10. [징검다리 건너기](https://programmers.co.kr/learn/courses/30/lessons/64062)
    * 두가지 해결 방법이 있는 문제
        * Sliding window Maximum 활용 (나는 이 방법을 썼다.. 이해하는데 오래걸렸다)
        * 이진 탐색하면서 일일이 check
         
11. [토마토](https://www.acmicpc.net/problem/7576)
    * 문제는 잘 풀었는데, python의 `deque`와 `array`의 `loop`에 관련하여 할말이 있다.
        * `for i in range(len(deque))` 가 `while len(deque) >= 1` 보다 확실하게 현재 `deque`에 포함된 모든 내용을 확인한다.
            * `while` 의 경우, `while` 문 내에서 `deque`값이 추가되면 그 값도 꺼내지게 된다. 
        * 2차원 `array`의 `loop`의 경우, 특정 값 `t`가 존재하는지 확인하고 싶다면 다음처럼 하면 좋다.     
            `for i in array: if t in i: print('exist!')`
         
12. [전구와 스위치](https://www.acmicpc.net/problem/2138)
    * greedy를 이용한 해법은 간단했지만, 그걸 떠올리기에는 역부족이였음   
        * 그리고 greedy인것을 알아도 시간초과를 피하기 위해선 조금 트릭이 필요했다.
        * greedy는 경우의 수를 제한하는 방법이라는 것을 생각하자.
    * [동전 뒤집기](https://www.acmicpc.net/problem/1285)
        * 이 문제도 비슷한 문제인데, 1차원 greedy가 2차원으로 확장되었다고 생각하면 됨.
        * Combination 구할 때, bit masking을 사용하면 유용하다.
            * 예시) `for i in range(0, 1 << n):` -> 이렇게 하면 `2^n`개의 조합(yes/no)을 구할 수 있다.
        * 잡설) 이 문제를 python으로 푼 사람이 아무도 없음 (속도가 느려서), 나도 pypy3으로 채점하고 있다.
            * 그리고 greedy가 이렇게 어려운 문제인지 몰랐음;;;
        
        
13. [Majority Element II](https://leetcode.com/problems/majority-element-ii/)
    * 핵심: 크기가 `n`인 배열 중 `⌊n/2⌋` 보다 큰 값은 반드시 **한**개만 존재한다.
        * 그럼 `⌊n/3⌋` 의 경우는 ?

14. [Gas Station](https://leetcode.com/problems/gas-station/)
    * 움직이면서 자원을 충전 그리고 소모를 반복하는 문제
         * 두 가지만 파악하면 되었다.   
             1. 움직이는 사이에 문제가 없음을 확인 모든 자원 >= 소모 자원 
             2. (1)이 확인되었다면, 반드시 정답은 존재     
                -> `0~n` 방향으로 자원 충전 및 소모 진행하면서 시작 위치 찾기 
             
14. [30](https://www.acmicpc.net/problem/10610)
    * 30에 대한 배경 지식과 greedy를 이용하여 푸는 문제
    * 깨달은점
        * 어떤 수의 모든 자리의 수를 더해서 3으로 나눠지면 그 수는 3의 배수다.
        * 배수 관련 문제가 나올때는 그 배수의 값들을 나열한 뒤, 패턴을 찾아보자.
        * 입력값이 말도안되게 크면, 의외로 로직은 간단하다. 

14. [부분수열의 합](https://www.acmicpc.net/problem/14225)
    * combination을 구하는 방식이 잘못되었다.
        * 부분 수열에서 combination 구하는 것은 sliding 방식으로 구해야 한다.     
        `(1,2,3) -> (1,2), (2,3), (1,2,3)`
  

15. [욕심쟁이 판다](https://www.acmicpc.net/problem/1937)
    * dfs (또는 bfs) + memoization 사용 문제
        * memoization 업데이트 방식이 내가 경험한 것과 다르다.
        * 주워 들음) dp는 한번 정하면 일반적으로 절대 수정하면 안되는 것을 원칙으로 하자.
        * 이 문제의 경우, memoization의 이유 말고도, 이미 방문한 곳은 절대 방문하지 않는다.. 왜? 판다의 특성 때문에
        * 다시 한번 살펴보는게 좋을 것 같다.

17. [골드바흐의 추측](https://www.acmicpc.net/problem/6588)   
    * 에라스토테네스의 채를 이용해 소수를 빠르게 구하는 방법을 터득하자.
    * ![image](https://upload.wikimedia.org/wikipedia/commons/b/b9/Sieve_of_Eratosthenes_animation.gif)
    * 참고 : `math.sqrt(m)` 대신에 `m ** 0.5` 를 사용하면 편리하다.

18. [ABCDE](https://www.acmicpc.net/problem/13023)
    * DFS에서 굳이 2d 배열로 연결되있지 않은 vertices 까지 체크할 필요가 없다.
        * `set()` 또는 `list()`가 들어간 2d 배열을 만들어서 연결되있는 것만 집어넣어 주자.
        * 그리고, dfs에서 이미 방문한 것을 확인할 수 있는 방법은 `set()` 말고 bit manipulation이 있다.
            * 우선 방문한 노드가 `i` 라고 가정하면, `z += (1 << i)` 로 `z` 에 저장
            * 이후 어떤 노드 `k`가 이미 방문했는지 확인하고 싶다면, `(1 << k) & z == 1` 로 확인한다.
            
19. [숨바꼭질3](https://www.acmicpc.net/problem/13549)
    * 가중치(cost)가 다른 문제에서의 BFS 사용: 이 문제는 cost가 다르다. (순간 이동 cost: 0, 움직임 cost: 1)
        * 너무 길어지는것을 막기 위해, 최대한 빠른걸 먼저 해결해야 하고, 이를 위해 그냥 queue 대신 priorityQueue를 사용한다.
        * 또한 문제 input에 대한 여러 경우의 수를 생각해보는 것을 잊지말자. 

20. [이분 그래프](https://www.acmicpc.net/problem/1707)
    * 이분 그래프의 정의
        1. > 그래프의 정점의 집합을 둘로 분할하여, 각 집합에 속한 정점끼리는 서로 인접하지 않도록 분할할 수 있을 때, 그러한 그래프를 특별히 이분 그래프 (Bipartite Graph) 라 부른다.
        2. 인접한 정점끼리 서로 다른 색으로 칠해서 모든 정점을 두 가지 색으로만 칠할 수 있는 그래프
        ![image](https://gmlwjd9405.github.io/images/data-structure-graph/bipartite-graph1.gif)
    * **각 정점에 대해서** BFS 또는 DFS 사용
        * BFS 또는 DFS를 사용하면서 특정 정점에 인접한 정점들은 특정 정점과 반대의 색을 칠한다.
        * 칠하는 도중, 만약 이미 칠해진 정점을 발견한 경우, 그 정점이 인접한 정점과 같은 색이라면 이분 그래프가 아니다.

21. [Largest Number](https://leetcode.com/problems/largest-number/)
    * 서로 붙여보면서 정렬하는 것이 핵심. 답은 정말 간단한데 너무 창의적이라 생각을 못했다.

22. [Two Sum](https://leetcode.com/problems/two-sum/solution/)
    * 주어진 배열의 두 숫자를 더해서 목적하는 값을 찾는 문제
        * `O(n^2)`은 너무 쉽고, `O(n)`으로 풀려면 hashtable을 사용해야 했다.  
        * hashtable에 숫자를 넣으면서 동시에 체크하는 방법이 빠름

23. [Maximum Number of Achievable Transfer Requests](https://leetcode.com/problems/maximum-number-of-achievable-transfer-requests/)
    * 최대/최소를 구하는 문제의 contraints가 작은 경우 (`1<= n<= 20`, `1<= request.length <=16`), 모든 조합을 고려해볼 것
        * `itertools.combinations` 사용

24. [Pokémon Army (easy version)](https://codeforces.com/contest/1420/problem/C1) 
    * Local minima & local maxima를 구하는 문제
        * 배열 `a`의 local minima란, `i`번째 원소 `a_i`가 `a_(i-1) >= a_i && a_i <= a_(i+1)`를 만족하는 경우 (구덩이, valley)
        * local maxima는 그 반대, 즉, `a_(i-1) <= a_i && a_i >= a_(i+1)` (동산, peak)
    * 배열에서 최대의 합을 구하는 문제가 있다면, 그 값들을 시각화 하는 것도 문제를 파악하는데 도움이 된다.
        * 만약 + 로 시작해서 -, +, -, + 이런 순으로 원소들의 최대 합을 구하는 문제가 있다면, 반드시 정답은 홀수 번 합이다 (e.g. + - +).
        
        
### Dynamic Programming (DP)
1. [거스름돈](https://programmers.co.kr/learn/courses/30/lessons/12907)
    * dp 문제인데, 타일 문제랑 비슷해서 햇갈렸다. 중요한점은 같은 값끼리 중복이 허용되지 않는 다는 점
        * 타일은 이미 섞어놓은 조합에서 하나를 더 얹는 것인데, 거스름돈 문제는 개별적으로 올려놓는 느낌 ?
        * 예를 들면, 5를 위해 2 + 1 + 1 과 1 + 1 + 2 은 타일에서 다르지만, 거스름돈에서는 같다. 즉, 1을 먼저 이용 후, 2를 처리해야함
       
2. [Maximum Non Negative Product in a Matrix](https://leetcode.com/contest/weekly-contest-207/problems/maximum-non-negative-product-in-a-matrix/)
    * 두개의 dp 배열을 활용해야 하는 문제 (창의적이다)    
        * Maximum dp, Minimum dp !

3. [로봇 조종하기](https://www.acmicpc.net/problem/2169)
    * [Maximum Non Negative Product in a Matrix](https://leetcode.com/contest/weekly-contest-207/problems/maximum-non-negative-product-in-a-matrix/) 문제와 마찬가지로, 2개의 dp 배열을 활용해야 하는 문제다.
        * 여기서는 특정 dp cell의 값을 정할 때, 어느 방향에서 오는가에 따라 dp 배열을 생성했다.  
              
### Interval 관련 문제    
1. [디스크 컨트롤러](https://programmers.co.kr/learn/courses/30/lessons/42627)
    * heap을 어떻게 사용하는가?
    * greedy이긴 한데 무엇을 greedy 할지 -> 가장 짧은 시간이 걸리는 것 중에서 가장 빠르게 요청이 온것을 처리함
        * 그렇다고 또 디스크가 놀고있으면 안되므로, 아무리 짧은 시간이 걸려도 하는게 없으면, 도착한 요청을 바로 처리
2. [단속카메라](https://programmers.co.kr/learn/courses/30/lessons/42884)
    * 정확성은 옳았으나, 효율적이지 못했음
    * 이것도 greedy
3. [회의실배정](https://www.acmicpc.net/problem/1931)
    * 핵심은 그리디 및 정렬
        * 의외로 간단한 문제였다. 하지만 난 틀렸지.
    * 열에 따른 정렬 방법 (tie 해결) `array.sort(key=lambda x: (x[1], x[0]))`
        * 두번째 열을 기준으로 오름차순 정렬 후, 두번째 열의 값이 서로 같으면 첫번째 열의 값으로 오름차순 정렬함
    
        
## 공부해야할 자료구조 또는 알고리즘
1. Segmentation Tree 
    * [구간 합 구하기](https://www.acmicpc.net/problem/2042)
        * 처음 구현해봄 (트리 생성, 수정, 구간 합)
    * [최솟값과 최댓값](https://www.acmicpc.net/problem/2357)
        * 구간의 합 대신, 최대값과 최소값을 segmentation tree로 구현 
        * 재귀에서 `return`을 이해하고 활용하는 연습이 더 필요함
        
        
2. Trie
3. Union-Find (복습)
4. 0-1 BFS 
5. Suffix Array
6. lazy propagation

* python tip
    1. 재귀 함수 최대 깊이 늘리기 `sys.setrecursionlimit(10**7)` (메모리 초과 가능성 농후)
    2. `ord` 는 character를 ascii 값으로, `chr`는 ascii 값을 character로 바꾸는 built-in function
    3. JAVA 와 같은 `comparator`를 이용하고 싶으면, `from functools import cmp_to_key`를 가져온 뒤에,   
    `sorted(nums, key=cmp_to_key(lambda x, y: x - y)))` 와 같은 방법으로 정렬을 하자. (물론 따로 `comparator` 함수를 정의해도 됨)
    4. 문제풀이 할때, 입력은 `sys.readline().strip()` 으로 받는다. 한 줄 통째로 받는 것          
        * 참고 : https://www.acmicpc.net/problem/15552
    5. `loop` 돌면서 특정 item 찾을 때, 못 찾을 경우 (`False/True`같은) temporary variable을 사용하지 않고 예외 처리 방법 
        ```python
       haystack = dict(); needle = 'a'
       for letter in haystack:
        if needle == letter:
            print('Found !')
            break
       else:    # If no break occurred (indentation을 for loop와 같이 맞춘다.)
            print('Not found!')
       ```
    6. `sample = defaultdict(dict)`은 `sample["a"]["b"] = 2`와 같은 형태로 `dict` 내 `dict`을 정의하게 해준다. 
    7. 2진수 (binary number)의 모든 1 계산하기 (`bin(i).count("1")`)
    8. 어떤 값 `a`에서 특정 값 `b`를 `a`가 0이 될 때까지 빼내기
        ```python
       a = 5; b = 3
       while a > 0:
           subtracted = min(a, b)      # b = 3 값을 빼냄
           a = max(0, a - b)                    # 빼낸 값 a를 조정
            
       ```