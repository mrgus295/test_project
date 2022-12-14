package codingTest;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dto.ObjectDto;
import impl.SolutionImpl;

public class Solution{
	SolutionImpl sImpl;
	
	
	// 끝말잇기 n : 참여 인원 수 , words : 단어 배열 
//	public int[] solution(int n, String[] words) {
//        int[] answer = new int[2];
//        int round = 1;
//        int num = 0;
//        boolean fail = false;
//        ArrayList<String> arr = new ArrayList<String>();
//        for(int i=0; i < words.length; i++) {
//        	System.out.println(i);
//        	if(arr.size()>0) {
//        		System.out.println(arr.get(arr.size()-1).charAt(arr.get(arr.size()-1).length()-1));
//        		System.out.println(words[i].charAt(words[i].length()-1));
//        		if(arr.get(arr.size()-1).charAt(arr.get(arr.size()-1).length()-1) == words[i].charAt(words[i].length()-1)) {
//        			for(String str : arr) {
//            			fail = words[i].equals(str) ?  true : false;
//            			num = (i)%n+1;
//            			if(fail) break;
//                	}
//        		}else break;
//        	}
//        	// 라운드
//        	round = i!=0 && i%n ==0 ? round+1 : round;
//        	// 순번
//        	arr.add(words[i]);
//        }
//        if(!fail) {
//        	num = 0;
//        	round = 0;
//        }
//        answer[0] = num;
//        answer[1] = round;
//        return answer;
//    }

	// 중복 포함 하여 완주하지 못한 사람 구하기.
//	public String solution(String[] participant, String[] completion) {
//		String answer = "";
//		
//		// 저장 공간 생성
//	    Map<String, Integer> map = new HashMap<String, Integer>();
//	    
//	    // 최초 도전자 입력
//	    for(String str : participant) {
//	    	map.put(str, map.get(str) == null ? 1 : map.get(str)+1);
//	    }
//	    // 완주자 삭제 (동명이인 체크)
//	    for(String str : completion) {
//	    	if(map.get(str) == 1) map.remove(str);
//	    	else map.put(str,map.get(str)-1);
//	    }
//	    // 남은 Key 값 return
//		answer = map.get(map.keySet().iterator().next()) == 1 ? map.keySet().iterator().next() : "";
//		
//	    return answer;
//    }
	
	// 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
//	public int solution(String[] s1, String[] s2) {
//        int answer = 0;
//        System.out.println(Arrays.toString(s1));
//        System.out.println(Arrays.toString(s2));
//        for(String s1Str :s1) {
//        	for(String s2Str : s2) {
//        		if(s1Str.equals(s2Str)) {
//        			answer+=1;
//        		}
//        	}
//        }
//        return answer;
//    }
	
	// 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
//	public int[] solution(int n, int m) {
//		int[] answer = new int[2];
//		int min = n > m ? m : n;
//		int max = n > m ? n : m;
//		System.out.println(min);
//		System.out.println(max);
//		int length = max%min == 0 ? max : max * min ;
//		System.out.println(length);
//		Deque<Integer> deque = new ArrayDeque<Integer>();
//		for(int i=1; i<=length; i++) {
//			System.out.println(i);
//			if(length % min == 0 || length % max == 0 ) deque.add(i);
//		}
//		System.out.println(deque);
//        answer[0] = deque.getFirst();
//        answer[1] = deque.getLast();
//        return answer;
//    }
	
	//각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
	// 경우의 수 생각 및 소수 구하기.
	// [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.
//	public int solution(String numbers) {
//		System.out.println(numbers);
//		int answer = Integer.parseInt(String.valueOf(numbers));
//        char[] arr = numbers.toCharArray();
//        String num = null;
//        length(arr);
////        	num = String.valueOf(arr[i]);
//////        	System.out.println(Integer.parseInt(String.valueOf(c)));
////        	if(i != arr.length-1) {
////        		for(int j=0; j< arr.length; j++) {
////        			num += String.valueOf(arr[j]);
////            		for(int k=0; k< arr.length; k++) {
////            			num += String.valueOf(arr[k]);
////                		System.out.println(num);
////                	}
////            	}
////        	}
//        if(numCheck(Integer.parseInt(numbers))) {
//        	// add
//        }
//        return 0;
//        
//    }
	
	// 순열 길이(배열)
//	public void length(char[] arr) {
//		// 조합 갯수
//		String s = "";
//		for(int i=1; i< arr.length+1; i++) {
//			System.out.println("조합 갯수:\t"+i);
//			System.out.println(choice(arr, i).toString());
//		}
//	}
	
	// 순열 숫자 조합 (숫자, 자리수)
//	public ArrayList<String> choice(char[] arr, int length) {
//		ArrayList<String> list = new ArrayList<String>();
//		// 조합 갯수
//		
//		for(int i=0; i< arr.length; i++) {
//			String num = "";
//			if(list.size() > i) {
//				num += list.get(i);
//			}
//			num += String.valueOf(arr[i]);
////			System.out.println(num);
////			if(num.length() < length) {
////				num += choice(arr, length);
////			}
//			list.add(num);
//		}
//		return list;
//	}
	
	// 소수 체크: 1과 자기 자신만을 약수로 가지는 수 (완성)
//	public Boolean numCheck(int s) {
//		int count = 0;
//		for(int i=1; i<=s; i++) {
//			if(s%i == 0) {
//				count+=1;
//			}
//		}
//		if(count==2) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
	
	
	// stream 공부(Stream: 데이터의 흐름  (람다식 표현 방식) 데이터 순회 문을 간단하게 표현 가능) 
	// 람다식
//	public List<ObjectDto> solution() {
//		long beforeTime = System.currentTimeMillis();
//		
//		System.out.println("반복할 횟수를 입력해주세요.");
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next().replaceAll("[^0-9]", "");
//		int leng = 0;
//		if(!"".equals(str))
//			leng = Integer.parseInt(str);
//		else {
//			System.out.println("빈 문자열 입니다.");
//			return null;
//		}
//			
//		System.out.println("입력이 "+leng+"회 만큼 반복됩니다.");
//		
//		// stream List <Object>
//		ArrayList<ObjectDto> objList = new ArrayList<ObjectDto>();
//		for(int i=1; i<leng; i++) {
//			ObjectDto obj = new ObjectDto();
//			obj.setNo(i);
//			obj.setName("이름"+i);
//			obj.setDepthCd(i);
//			obj.setDepthNm("IT_"+i+"_팀");
//			objList.add(obj);
//		}
//		
//		// input 받기
//		System.out.println("시작 점을 입력해주세요.");
//		
//		int num = Integer.parseInt(sc.next().replaceAll("[^0-9]", ""));
//		System.out.println("입력 값 "+num+"개 이후 결과만 표현됩니다.");
//		
//		int idx = 0;
//		if(num > 0)
//			idx = num-1;
//		else 
//			idx = num;
//		
//		// input 사이즈 체크
//		int size = (int) objList.stream()
//				.filter(dto -> dto.getNo() > 0)
//				.skip(idx)
//				.count();
//		
//		if(size == 0) {
//			System.out.println("결과 값이 존재하지 않습니다.");
//			return null;
//		}
//		
//		// stream List<String> 반환 키(map) 값 지정
//		List<ObjectDto> stream = objList.stream()
//				.filter(dto -> dto.getNo() > 0)	// 필터 조건(where)
//				.skip(idx)	// n개 결과 값 건너 뜀.
////				.limit(10)	// n개 반환 갯수 지정
//				.sorted(Comparator.comparing(ObjectDto::getNo))	// 내림차순 asc Java 9 ver 이상 사용가능
//				.collect(Collectors.toList());	// List화
//		
//		int totCnt = (int) objList.stream()
//				.filter(dto -> dto.getNo() > 0)	// 필터 조건(where)
//				.skip(idx)
////				.limit(10)	// n개 반환 갯수 지정
//				.count();
//		
//		System.out.println(stream.toString());
//		System.out.println("결과 값 갯수: "+totCnt+" 개");
//		
//		System.out.println(objList.stream().allMatch(dto -> dto.getNo()> 0));	// 모든 결과 값이 조건에 만족하는 지 (boolean)
//		System.out.println(objList.stream().anyMatch(dto -> dto.getNo()> 0));	// 결과 값 중 조건에 만족하는 값이 1개 이상일 때 (boolean)
//		System.out.println(objList.stream().noneMatch(dto -> dto.getNo()> 0));	// 결과 값 중 조건에 만족하는 값이 하나도 없는지 (boolean) 
//		
//		List<Integer> streamInt = objList.stream()
//				.filter(dto -> dto.getNo() > 0)	// 조건식
//				.map(ObjectDto::getNo)	// mapping value만 결과로 담기.
//				.distinct()	// 중복 제거
//				.collect(Collectors.toList());
//		
//		System.out.println(streamInt.toString());
//		Map<String, Object> map = new HashMap<String, Object>();
//		long afterTime = System.currentTimeMillis(); 
//		long secDiffTime = (afterTime - beforeTime)/1000;
//		System.out.println("시작 시간: "+beforeTime);
//		System.out.println("종료 시간: "+afterTime);
//		System.out.println("시간 차 :"+(afterTime - beforeTime));
//		System.out.println("처리 시간: "+secDiffTime);
//		
//		return stream;
//	}
	
////	람다식
//	public void solution(String str) {
//		sImpl = () -> {
////			Stream<String> stream = Arrays.stream(arr);
//			System.out.println("람다식 표현");
////			System.out.println(stream);
//		};
//		sImpl.noReturn();
//	}
	
//	public int[] solution(int[] arr, int divisor) {
//		int idx = 0;
//		int leng = 0;
//		for(int i : arr) {
//			arr[idx] = i%divisor == 0 ? i : 0;
//			idx++;
//			leng = i%divisor == 0 ? leng+1 : leng;
//		}
//		int[] answer = leng > 0 ? new int[leng]: new int[1];
//		idx =0;
//		if(leng > 0) {
//			for(int i : arr) {
//				if( i != 0 &&i%divisor == 0) {
//					answer[idx] = i;
//					idx++;
//				}
//			}
//			for(int i=answer.length-1; i>0; i--) {
//				for(int j=0; j < i; j++) {
//					if (answer[j] > answer[j+1]) {
//						int t = answer[j];
//						answer[j] = answer[j + 1];
//						answer[j + 1] = t;
//					}
//				}
//			}
//		}else {
//			answer[idx] = -1;
//		}
//        return answer;
//    }
	
//	전화번호 마스킹 처리
//	public String solution(String phone_number) {
//        
//        char[] arr = phone_number.toCharArray();
//        System.out.println(phone_number);
//        for(int i=0; i<arr.length; i++) {
//        	if(arr.length-4 > i) {
//        		arr[i] = '*';
//        	}
//        }
//        String answer = String.valueOf(arr);
//        return answer;
//    }
	
	
//	String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수
//	public String solution(String[] seoul) {
//        int count = -1;
//        for(String str : seoul) {
//        	count++;
//        	if(str.toLowerCase().matches("kim"))
//        		break;
//        }
//        return "김서방은 "+count+"에 있다";
//    }
	
//	 LOOP 연산 문제 
//	public int solution(int num) {
//        int answer = 0;
//        Long result = (long) num;
//        while (result != 1) {
//        	answer = answer > 500 ? -1:answer+1;
//        	if(answer == -1) {
//        		answer = -1;
//        		break;
//        	}else {
//        		result = result%2 == 0 ? result/2: (result*3)+1;
//        	}
//        	
//		}
//        System.out.println(answer);
//        System.out.println(result);
//        return answer;
//    }
	
	
	
	// 등차수열
//	public long solution(int a, int b) {
//        long answer = 0;
//        int start =0;
//        int end = 0;
//        start = (a>b) ? b : a;
//        end = (a>b) ? a : b;
//        for(int i=start; i<=end; i++) {
//        	answer += start+(i-start);
//        }
//        System.out.println(answer);
//        return answer;
//    }
	
	// 내림차순 정렬 (실패) 
//	public long solution(long n) {
//        long answer = 0;
//        System.out.println(String.valueOf(n).length());
//        char[] arr = String.valueOf(n).toCharArray();
//        char[] result = new char[String.valueOf(n).toCharArray().length]; 
//        for(int i=0; i<arr.length; i++) {
//        	System.out.println("===");
//        	System.out.println(arr[i]);
//        	System.out.println("===");
//        	for(int j=arr.length-1; j>=0; j--) {
//        		System.out.println(arr[j]);
////        		if(arr[j+1]>arr[i]) {
////        			result[j] = arr[j-1];
////        		}
//        		if(j>0) {
//        			if (Integer.parseInt(String.valueOf(arr[j])) > Integer.parseInt(String.valueOf(arr[j-1]))) {
//    					char t = arr[j];
//    		            result[j-1] = arr[j];
//    		            result[j] = (char) t;
//    				}
//        		}
//        	}
//        }
//        System.out.println(String.valueOf(result));
//        return answer;
//    }
	
//	solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴
//	public long[] solution(int x, int n) {
//        long[] answer = new long[n];
//        
//        for(long i=0; i<n; i++) {
//        	answer[(int) i]= x*(i+1);
//        }
//        System.out.println(Arrays.toString(answer));
//        return answer;
//    }
	
	// 입력받은 정수를 뒤집은 뒤 배열로 반환
//	public int[] solution(long n) {
//		String str = String.valueOf(n);
//        int[] answer = new int[(int) str.length()];
//        
//        str = new StringBuffer(str).reverse().toString();
//        
//        for(int i=0; i<str.toCharArray().length; i++) {
//        	answer[i] = Integer.parseInt(String.valueOf(str.toCharArray()[i]));
//        }
//        return answer;
//    }
	
//	public String solution(String s) {
//        String answer = "";
//        System.out.println(Arrays.toString(s.split(" ")));
//        int min = 0;
//        int max = 0;
//        min = Integer.parseInt(s.split(" ")[0]);
//        max = Integer.parseInt(s.split(" ")[0]);
//        for(int i=0; i<s.split(" ").length; i++) {
//        	System.out.println(Integer.parseInt(s.split(" ")[i]));
//        	if(Integer.parseInt(s.split(" ")[i]) < min)
//    			min = Integer.parseInt(s.split(" ")[i]);
//        	if(Integer.parseInt(s.split(" ")[i]) > max)
//        		max = Integer.parseInt(s.split(" ")[i]);
//        }
//        
//        answer = min+" "+max;
//        System.out.println(answer);
//        return answer;
//    }
	
//	public boolean solution(int x) {
//        boolean answer = true;
////        System.out.println((x+"").toCharArray());
//        int value = 0;
//        for(char c: (x+"").toCharArray()) {
//        	System.out.println();
//        	value+=Integer.parseInt(c+"");
//        }
//        System.out.println(value);
//        if(x%value != 0) {
//        	answer = false;
//        }
//        return answer;
//    }
	
//	boolean solution(String s) {
//        boolean answer = true;
//        String str = s.toLowerCase();
//        if(str.replaceAll("[^y]", "").length() != str.replaceAll("[^p]", "").length())
//        	answer = false;
//        return answer;
//    }
	
	
//	public long solution(long n) {
//        long answer = 0;
//        Double x = Math.sqrt(n);
//        if(x == x.intValue())
//        	answer = (long) Math.pow(x+1, 2);
//        else {
//        	answer = -1;
//        }
//        System.out.println(answer);
//        
//        return answer;
//    }
	
	
//	public int[] solution(long n) {
//        int[] answer = {};
//        String str = "";
//        
//        for(int i=String.valueOf(n).length()-1; i>=0; i--){
//        	str += String.valueOf(n).charAt(i);
//        }
//        
//        System.out.println(str);
//        
//        for(int j=0; j<str.toCharArray().length; j++) {
//        	System.out.println(j);
//        	answer[j] = Integer.parseInt(str.charAt(j)+"");
//        }
//        
//        System.out.println(Arrays.toString(answer));
//        return answer;
//    }
//	초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
//	public int[] solution(int[] prices) {
//        int[] answer = {};
//        
//        i = Integer.parseInt(String.valueOf(i).charAt(String.valueOf(i).length()-1));
//        System.out.println(Integer.parseInt(i));
        
//        System.out.println(Arrays.toString(prices));
//        for(int i=0; i<prices.length; i++) {
//        	for(int j=i; j+1<prices.length; j++) {
//        		if(prices[i] <= prices[j+1]) {
////        			answer[i] = prices.length-j;
//        			System.out.println(prices.length-j);
//        			break;
//        		}
//        		else {
//        			System.out.println(1);
//        		}
//        	}
//        }
//        System.out.println(Arrays.toString(answer));
//        return answer;
//    }
	
//	public long[] solution(long[] numbers) throws Exception{
//        long[] answer = {};
//        ArrayList<String> arr = new ArrayList<String>();
//        for(long i : numbers) {
//        	arr.add(String.format("%08d", Byte.parseByte(Integer.toBinaryString((int) i))));
//        	System.out.println(String.format("%08d", Byte.parseByte(Integer.toBinaryString((int) i))));
//        }
//        
//    	String str = arr.get(0);
//    	String s = arr.get(1);
//    	ArrayList<Long> longArr = new ArrayList<Long>();
//    	for(int i=0; i<str.toCharArray().length; i++) {
//    		if(s.charAt(i) != str.charAt(i)) {
//    			longArr.add(Long.parseLong(String.valueOf(s.charAt(i))));
//    		}
//    	}
//    	for(int i=0; i<longArr.size(); i++) {
//    		answer[i] = longArr.get(i);
//    	}
//        return answer;
//    }
	
//	public String solution(String number, int k) {
//        String answer = "";
//        System.out.println(number+" \t"+k);
//        System.out.println(number.length()-k+"\t자리수");
//        ArrayList<String> strArr = new ArrayList<String>();
//        for(int i=0; i<number.length(); i++) {
////        	System.out.println(number.charAt(i));
//        	String str = String.valueOf(number.charAt(i)) ;
//        	for(int j=number.length()-1; j>=0; j--) {
//        		if(number.charAt(i) != number.charAt(j)) {
//        			str = String.valueOf(str+number.charAt(j));
//        			for(int z=0; z<number.length()-k; z++) {
//        				str = str+number.charAt(z);
//    	        		System.out.println(str);
//    	        		strArr.add(str);
//    	        	}
//        		}
//        	}
//        }
//        answer = strArr.get(0);
//        for(int i=0; i<strArr.size()-1; i++) {
//        	if(Integer.parseInt(answer)< Integer.parseInt(strArr.get(i+1))) {
//        		answer = strArr.get(i+1);
//        	}
//        }
//		System.out.println("최대 값 \t"+answer);
//        return answer;
//    }
	
	// 캐시 정리 LRU
//	public int solution(int cacheSize, String[] cities) {
//		int answer = 0;
//		System.out.println(cacheSize+""+Arrays.toString(cities));
//		long beforeTime = System.currentTimeMillis();
//		
//		
//		
//		long afterTime = System.currentTimeMillis(); 
//		long secDiffTime = (afterTime - beforeTime)/1000;
//		
//		answer = Integer.parseInt(secDiffTime+"");
//		
//		return answer;
//	}
	
//	10진수 => 3진수 => 숫자 순서 뒤집기 => answer:10진수표현 
//	public int solution() {
//        int answer = 0;
//        int n = 45;
//        String str = Integer.toString(n,3);
//        System.out.println(str);
//        String ans = "";
//        for(int i=str.length()-1; i>=0; i--) {
//        	System.out.println(str.charAt(i));
//        	ans+=str.charAt(i);
//        }
//        System.out.println(ans);
//        answer = Integer.parseInt(ans,3);
//        System.out.println(answer);
//        return answer;
//    }
	
//	두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//	public static void main(String[] args) {
//		int a = 3;
//		int b = 5;
//		long answer = 0;
//		int c = 0;
//		if(a>b) {
//			c=a;
//			a=b;
//			b=c;
//		}
//		for(int i=a; i<b+1; i++) {
//			answer += i;
//		}
//		System.out.println(answer);
//	}
	
	
//	public static void main(String[] args) {
//		int[] answer = {};
//		int []arr = {1, 1, 3, 3, 0, 1, 1};
//		Set<Integer> set = new HashSet<Integer>();
//        for(int i=0; i<arr.length; i++) {
//			set.add(arr[i]);
//        }
//        answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();
//        System.out.println(Arrays.toString(answer));
//	}
	
//	public static void main(String[] args) {
////		중간 글자 뽑기 홀수 중간 1자리 / 짝수 중간 2자리
////		String s = "qwer";
////		if(s.length()%2 == 0) {
////			answer = String.valueOf(s.charAt(s.length()/2-1))+String.valueOf(s.charAt(s.length()/2));
////		}else {
////			answer = String.valueOf(s.charAt(s.length()/2));
////		}
////		System.out.println();
//
////S
////D
////
////T
////1
////2
////*3
////S :2
////D :*3
////Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 3
////	at java.util.ArrayList.rangeCheck(ArrayList.java:657)
////	at java.util.ArrayList.get(ArrayList.java:433)
////	at codingTest.Solution.main(Solution.java:43)
//
//		// 다트 게임
//		String dartResult = "1S2D#3T";
//		ArrayList<String> strList = new ArrayList<String>();
//		ArrayList<String> scoreList = new ArrayList<String>();
//		for(String str : dartResult.split("[^A-Z|*]")) {
//			if(!"".equals(str)) {
//				System.out.println(str);
//				strList.add(str.replace("*", ""));
//			}
//		}
//		for(String str : dartResult.split("[A-Z]")) {
//			scoreList.add(str);
//		}
//		System.out.println(strList);
//		System.out.println(scoreList);
//		for(int i=0; i<strList.size(); i++) {
//			if(strList.get(i).equals("S")) {
//				System.out.println("S :"+ scoreList.get(i));
//			}else if(strList.get(i).equals("D")) {
//				System.out.println("D :"+ scoreList.get(i));
//			}else if(strList.get(i).equals("T")) {
//				System.out.println("T :"+ scoreList.get(i));
//			}
//			if(scoreList.get(i).replaceAll("[0-9]","") != "") {
//				if(scoreList.get(i).replaceAll("[0-9]","").equals("*")) {
//					System.out.println("*");
//					System.out.println(4*Integer.parseInt(scoreList.get(i).replaceAll("[^0-9]", "")));
//					
//				}else if(scoreList.get(i).replaceAll("[0-9]","").equals("#")) {
//					System.out.println("#");
//					System.out.println(-1*Integer.parseInt(scoreList.get(i).replaceAll("[^0-9]", "")));
//				}else {
//					Integer.parseInt(scoreList.get(i).replaceAll("[^0-9]", ""));
//					System.out.println();
//					System.out.println(Integer.parseInt(scoreList.get(i).replaceAll("[^0-9]", "")));
//				}
//				System.out.println();
//			}
////			if(scoreList.get(i).matches("[*]")) {
////				System.out.println(scoreList.get(i));
////			}
//			
//		}
//		int answer = 0;
//	}
	
//	public static void main(String[] args) {
//		// 정렬 알고리즘
////		long answer = 0;
////		long n = 12345678;
////		char[] str = String.valueOf(n).toCharArray();
////		String s = "";
////		for(int i=str.length-1; i>0; i--) {
////			for(int j=0; j < i; j++) {
////				if (str[j] > str[j+1]) {
////					int t = str[j];
////                    str[j] = str[j + 1];
////                    str[j + 1] = (char) t;
////				}
////			}
////		}
////		for(char st : str) {
////			s += st;
////		}
////        answer = Long.parseLong(s);
//		
////		소수 더하기
////		int[] arr = {1,2,3,4};
////        double answer = 0;
////        int sum = 0;
////        for(int i=0; i<arr.length; i++){
////            sum += arr[i];
////        }
////        answer =  (double)sum/arr.length + (double)sum%arr.length;
////        System.out.println(answer);
//		
////		int a = 7;
////		int b = 28;
////		String answer = "";
////		
////		// 4년 마다 윤년
////		String[] str = {"FRI","SAT","SUN","MON","TUE","WED","THU"}; 
////		int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
////		int sum = 0;
////		for(int i=0; i<a; i++) {
////			sum += days[i];
////		}
////		answer = str[sum%7-1];
////		System.out.println(sum%7-1);
////		System.out.println(answer);
////        return answer;
//		
////		result [3,8]
//		String s = "110010101001";
//		
//		char[] charList =  s.toCharArray();
//		System.out.println(charList);
//		int count = 0;
//		String str = "";
//		for(int i=0; i<charList.length; i++) {
//			if(charList[i] == '0') {
//				count++;
//				System.out.println(charList[i]);
//			}else {
//				str += charList[i];
//			}
//		}
//		System.out.println(count);
////		System.out.println();
//		int answer = str.length();
//		
//		System.out.println(answer);
//		System.out.println(answer%2);
//		System.out.println(Integer.toBinaryString(answer));
//		System.out.println();
//		System.out.println();
//		
////		ㅋㅋㅋ 자판기 ㅋㅋ
//		while(true) {
//			String[] strList = {"데미소다","제로콜라","아이스 아메리카노","카페라떼"};
//			int[] priceList = {1000,1200,1500,2000};
//			Scanner sc = new Scanner(System.in);
//			int data = sc.nextInt();
//			System.out.println(data);
//			for(int i=0; i<priceList.length; i++) {
//				if(data>= priceList[i]) {
//					System.out.print(strList[i]);
//				}
//			}
//			int data2 = sc.nextInt();
//			if(data2>priceList.length) {
//				System.out.println("잘못된 입력 값입니다.");
//				System.out.println("돈 반환: "+ data);
//			}else {
//				System.out.println(strList[data2-1]);
//				System.out.println("덜컹 ~ \'"+strList[data2-1]+"\'가 나왔습니다. 거스름 돈:"+ String.valueOf(data-priceList[data2-1])+"원");
//				
//				System.out.println("계속 진행 하시겠습니까?(Y/N)");
//				String data3 = sc.next();
//				
//				
//				if(data3.equals("Y")) {
//					
//				}else {
//					System.out.println("거스름 돈:"+ String.valueOf(data-priceList[data2-1])+"원");
//				}
//			}
//			
//		}
//		
//	}
	

	
	
//	public int solution(int[] priorities, int location) {
//        int answer = 0;
//        String a = Arrays.toString(priorities);
//        for(int i=priorities.length-1; i>0; i--) {
//			for(int j=0; j < i; j++) {
//				if (priorities[j] < priorities[j+1]) {
//					int t = priorities[j+1];
//					priorities[j+1] = priorities[j];
//					priorities[j] = t;
//				}
//			}
//		}
//        for(int i=0; i<priorities.length; i++) {
//        	if(priorities[location] == priorities[i]) {
//        		answer = i;
//        		break;
//        	}
//        }
//		return answer;
//    }
	
	public void data() {
//		Stack<Integer> stack = new Stack<Integer>();
//		System.out.println("================ Stack ===============");
//		System.out.println(stack);
//		for(int i=0; i<10; i++) {
//			stack.push(i);
//			System.out.println(stack);
//		}
//		System.out.println(stack);
//		for(int i=0; i<10; i++) {
//			stack.pop();
//			System.out.println(stack);
//		}
//		System.out.println("================ Queue ===============");
//		Queue<Integer> que = new LinkedList<Integer>();
//		System.out.println(que);
//		for(int i=0; i<10; i++) {
//			que.add(i);
//			System.out.println(que);
//		}
//		for(int i=0; i<10; i++) {
//			// 맨앞 제거 X
//			que.peek();
//			System.out.println(que);
//		}
//		for(int i=0; i<10; i++) {
//			// 맨앞 제거 O
//			que.poll();
//			System.out.println(que);
//		}
//		System.out.println("================ DeQueue ===============");
//		Deque<Integer> deque = new ArrayDeque<Integer>(8);
//		
//		System.out.println(deque.size());
//		System.out.println(deque);
//		for(int i=0; i<10; i++) {
//			deque.add(i);
//			System.out.println(deque);
//		}
//		for(int i=0; i<10; i++) {
//			// 앞,뒤 제거 X
//			deque.peekFirst();
//			deque.peekLast();
//		}
//		System.out.println(deque);
//		for(int i=0; i<10; i++) {
//			// 앞,뒤 제거 O
//			deque.pollFirst();
//			deque.pollLast();
//			System.out.println(deque);
//		}
	}
	
	// 주어지는 배열이 연결되어있는 옹알이하는 아가가 발음할 수 있는 리스트 갯수 return 
	public int solution(String[] babbling) {
        int answer = 0;
        String[] able = {"aya", "ye", "woo", "ma"};
        ArrayList<String> ableList = new ArrayList<String>();
        
        for(String str : babbling) {
        	String repStr = str;
        	System.out.println("===\t"+str+"\t===");
        	for(String s : able) {
        		System.out.println("---\t"+s+"\t---");
        		if(repStr.contains(s)) {
        			if(repStr.split(s).length>0) {
        				repStr = repStr.split(s)[0].equals("") || repStr.split(s).length == 0 || repStr.split(s).length == 1 || s == repStr.split(s)[repStr.split(s).length-1] ? repStr.replace(s,""): repStr;
        				System.out.println("s =>\t"+s);
        				System.out.println(repStr);
        			}
        			if(repStr.length() == 0) {
            			ableList.add(str);
            		}
        		}else {
        			System.out.println("포함하지않음");
        		}
        	}
        }
        System.out.println(ableList);
        answer =  ableList.size();
        
        return answer;
    }
	
//	n개중 r개 조합
//	nCr
//	public static void main(String[] args) {

		
//		String s = "1 2 3 4";
//		solutionCls.solution(s);
//		System.out.println(solutionCls.solution(prices));
		
//		int[] arr = {3,2,6};
//		int divisor = 10;
//		System.out.println(Arrays.toString(solutionCls.solution(arr, divisor)));
//		Solution solutionCls = new Solution();
//		System.out.println(solutionCls.solution());
		
		// 순열 조합 + 소수
//		System.out.println(solutionCls.solution("1723"));
		
		// 미완주 인원 구하기 변수
//		String[] participant = {"mislav", "stanko", "mislav", "ana"};
//		String[] completion = {"stanko", "ana", "mislav"};
		
		// 같은 원소 갯수 구하기
//		String[] s1 = {"a", "b", "c"};
//		String[] s2 = {"com", "b", "d", "p", "c"};
		
//		int n = 2;
//		int m = 5;
		
//		
//		int n = 3;
//		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//		
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2;
//		System.out.println(solutionCls.solution(priorities, location));
//		String[] arr = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		
//		System.out.println(solutionCls.solution(arr));
//		String end =	"20221207002038";
//		String start =	"20221206235839";
		
		
//		20221206145839	20221206152038
//		Long lStart = Long.parseLong(start);
//		Long lEnd = Long.parseLong(end);
		
//		Long lStart = Long.parseLong(start) < Long.parseLong(end) ? Long.parseLong(start) : Long.parseLong(end);
//		Long lEnd = Long.parseLong(start) > Long.parseLong(end) ? Long.parseLong(start) : Long.parseLong(end);
//		
//		System.out.println("==========");
//		System.out.println(lEnd-lStart);
//		System.out.println("==========");
//		System.out.println(lStart-lEnd);
//		System.out.println("==========");
//		
//		try {
//			Date startFormat = new SimpleDateFormat("yyyyMMddhhmmss").parse(start);
//			Date endFormat = new SimpleDateFormat("yyyyMMddhhmmss").parse(end);
//			System.out.println(startFormat);
//			System.out.println(startFormat.getTime());
//			System.out.println("============");
//			System.out.println(endFormat);
//			System.out.println(endFormat.getTime());
//			System.out.println("============");
//			System.out.println(endFormat.getTime() - startFormat.getTime());
//			System.out.println((endFormat.getTime() - startFormat.getTime()) / 1000+"초");
//			System.out.println((endFormat.getTime() - startFormat.getTime()) / 60000+"분 "+ ((endFormat.getTime() - startFormat.getTime()) % 60000)/1000+"초");
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		int[] arr2 = {4,3,2,1};
		
//		int[] absolutes = {4,7,12};
//		boolean[] signs = {true,false,true};
//		int[] arr2 = {1,2,3,4,6,7,8,0};
		
//		String s = "abcde";
//		int m = 3;
//		System.out.println(solutionCls.solution(m));
//		
//	}
//	public int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//        for(int i=0; i<prices.length; i++) {
//        	for(int j=i+1; j<prices.length; j++) {
//        		if(prices.length == j)
//        			answer[prices.length-1] = j;
//        		if(prices[i] >= prices[j])
//        			answer[i] = j-i;
////        		 else {
////        			 answer[i] = j-i;
////        			 break;
////        		 }
//        	}
//        }
//        
//        return answer;
//    }

//	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
//	단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//	public int[] solution(int[] arr) {
//		int lenth = arr.length > 1 ? arr.length-1 : 1;
//        int[] answer = new int[lenth];
//        int min = arr[0];
//        for(int i=0; i<arr.length; i++) {
//        	min = min > arr[i] ?  arr[i]: min;
//        }
//        int j = 0;
//        for(int i : arr) {
//        	if(i != min) {
//        		answer[j] = i;
//        		j ++;
//        	}
//        }
//        if(answer.length <= 1)
//         answer[0] = -1;
//        return answer;
//    }
	
//	어떤 정수들이 있습니다. 
//	이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 
//	실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
//	public int solution(int[] absolutes, boolean[] signs) {
//        int i=0;
//        int answer = 0;
//		for(boolean t : signs) {
//			answer = t ? answer+absolutes[i] : answer-absolutes[i];
//			i++;
//		}
//        return answer;
//    }
	
//	0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
//	numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
//	public int solution(int[] numbers) {
//        int answer = 0;
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        for(int i =1; i<10; i++) {
//        	arr.add(i);
//        }
//        for(int i=0; i<numbers.length; i++) {
//        	for(int j=0; j<arr.size(); j++) {
//        		if(arr.get(j) == numbers[i])
//        			arr.remove(j);
//        	}
//        }
//        for(int i : arr) {
//        	answer += i;
//        }
//        return answer;
//    }
	
//	가운데 글자 가져오기(짝수 == 2글자, 홀수 == 1글자)
//	public String solution(String s) {
//        String answer = s.length()%2 == 1 ? String.valueOf(s.charAt(s.length()/2+s.length()%2-1)) : String.valueOf(s.charAt(s.length()/2-1))+String.valueOf(s.charAt(s.length()/2));
//        return answer;
//    }
	
//	수박 * n + 수 (홀수) 
//	public String solution(int n) {
//		String answer = "";
//		for(int i=0; i<n/2; i++) {
//			answer += n%2 ==1 ? "수박": "수";
//			answer += n%2 ==0 ? "수박": "수";
//		}
//        return answer;
//    }
	
//	정수 내림차순으로 배치하기
//	public long solution(long n) {
//		char[] str = String.valueOf(n).toCharArray();
//		for(int i=str.length-1; i>0; i--) {
//			for(int j=0; j < i; j++) {
//				if (str[j] < str[j+1]) {
//					int t = str[j];
//	                str[j] = str[j + 1];
//	                str[j + 1] = (char) t;
//				}
//			}
//		}
//        long answer = Long.parseLong(String.valueOf(str));
//        return answer;
//    }
	
//	길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다.
//	a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
//	내적: a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
//	public int solution(int[] a, int[] b) {
//		int answer = 0;
//		for(int i=0; i<a.length; i++) {
//			int j = a[i] * b[i];
//			answer += j;
//		}
//        return answer;
//    }
	
//	문자열 내림차순으로 배치하기
//	public String solution(String s) {
//        System.out.println(Arrays.toString(s.toCharArray()));
//        char[] str = s.toCharArray();
//        for(int i=str.length-1; i>0; i--) {
//			for(int j=0; j < i; j++) {
//				if (str[j] < str[j+1]) {
//					int t = str[j];
//	                str[j] = str[j + 1];
//	                str[j + 1] = (char) t;
//				}
//			}
//		}
//        
//		String answer = String.valueOf(str);;
//        return answer;
//    }
	
//	약수의 개수와 덧셈
//	public int solution(int left, int right) {
//		int answer = 0;
//		for(int i=left; i<right+1; i++) {
//			int count = 0;
//			for(int j=1; j<i+1; j++) {
//				if(i%j == 0) {
//					count ++;
//					System.out.println(j);
//				}
//			}
//			answer = count>0 && count % 2 == 0 ? answer+i : answer-i;
//		}
//        return answer;
//    }
	
//	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
//	예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
//	public boolean solution(String s) {
//		boolean answer = (s.length() == 4 || s.length() == 6) && !s.matches(".*[a-zA-Z].*");
//        return answer;
//    }
	
	
//	price	money	count	result
//	3		20		4		10
//	새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
//	즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다. 
//	놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
//	단, 금액이 부족하지 않으면 0을 return 하세요.
//	public long solution(int price, int money, int count) {
//		long sum = 0;
//        for(int i=count; i>0; i--) {
//        	sum = sum+(price*i);
//        }
//        long answer = money - sum < 0 ? Math.abs(money - sum) : 0;
//        return answer;
//    }
	
	
	public String solution(String s) {
		String answer = "";
        System.out.println(Arrays.toString(s.split(" ")));
		for(int j=0; j <s.split(" ").length; j++) {
        	String str = s.split(" ")[j];
        	if("".equals(str)) {
        		answer += " ";
        	}else{
        		char[] arr = str.toCharArray();
            	for(int i=0; i<arr.length; i++) {
        			arr[i] = i%2 == 0 ? String.valueOf(arr[i]).toUpperCase().charAt(0): String.valueOf(arr[i]).toLowerCase().charAt(0);
        			System.out.println(arr[i]);
                }
            	str = String.valueOf(arr)+"";
            	answer += str;
        	}
        	System.out.println(str);
        }
        
        answer = answer.trim();
        return answer;
    }
	
	public static void main(String[] args) {
//		직사각형 별찍기
//		Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for(int i=0; i<b; i++) {
//        	for(int j=0; j<a; j++) {
//        		System.out.print("*");
//        		if(j== a-1)
//        			System.out.print("\n");
//        	}
//        }
        
//		행렬의 덧셈(미완료)
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
//		같은 숫자는 싫어(미완료)
		int[] arr = {1,1,3,3,0,1,1};
		
		String s = "  tRy hello  WORLD    ";
		
		Solution solution = new Solution();
		System.out.println(solution.solution(s));
		
	}

//	행렬의 덧셈 (미완료)
//	행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
//	2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
//	arr1			arr2			return
//	[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//	[[1],[2]]		[[3],[4]]		[[4],[6]]
	public int[][] solution(int[][] arr1, int[][] arr2) {
        
    	for(int i=0; i<arr1.length; i++) {
        	for(int j=0; j<arr1[i].length; j++) {
        		System.out.println(arr1[i][j]+arr2[i][j]);
        	}
        }
    	int[][] answer = new int[arr1.length][];
        for(int[] i : arr1) {
        	for(int j : i) {
        		System.out.println(j);
        	}
        }
        for(int[] i : arr2) {
        	for(int j : i) {
        		System.out.println(j);
        	}
        }
        return answer;
    }
	
	
//	최대 공약수 , 최소 공배수
//	n	m	return
//	3	12	[3, 12]
//	2	5	[1, 10]
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
		int min = n > m ? m : n;
		int max = n > m ? n : m;
		int length = max%min == 0 ? max : max * min ;
		
		// 최대 공약수
		for(int i=max; i>0; i--) {
			if(min%i == 0 && max%i ==0) {
				System.out.println("공약수:\t"+i);
				answer[0] = i;
				break;
			}
		}
		// 최소 공배수
		for(int i=1; i<=min*max; i++) {
			
//			if(min*i == max || min*i == max) {
//				System.out.println("공배수:\t"+min*i);
//				answer[1] = min*i;
//				break;
//			}
		}
		System.out.println(Arrays.toString(answer));
        return answer;
    }
	
//	같은 숫자는 싫어
	public int[] solution(int []arr) {
        Queue<Integer> que = new LinkedList<Integer>();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i : arr) {
        	int j = que.size() > 0 ? que.peek(): 0;
        	if(j != i)
        		que.add(i);
        }
        
        int[] answer = new int[que.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = que.poll();
        }
        return answer;
    }
}

