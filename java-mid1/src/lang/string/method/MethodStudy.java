package lang.string.method;

public class MethodStudy {

    /*
    문자열 정보 조회
    1. length() : 문자열의 길이를 반환
    2. isEmpty() : 문자열이 비어 있는지 확인      (길이 0)
    3. isBlank() : 문자열이 비어 있는지 확인한다.  (길이 0이거나 공백만 있는경우)
    4. charAt(int index) : 지정된 인덱스에 있는 문자를 반환한다.

    문자열 비교
    1. equals
    2. equalsIgnoreCase : 대소문자 구분 없이 비교
    3. compareTo(String ) : 사전 순으로 비교
    4. compareToIgnoreCase(String ) : 대소문자 구분 없이 사전적으로 비교
    5. startsWith(String ) : 문자열이 특정 접두사로 시작하는지 확인
    6. endsWith(String ) : 문자열이 특정 접미사로 끝나는지 확인

    문자열 검색
    1. contains(CharSequence s) : 문자열이 특정 문자열을 포함하고 있는지 확인한다.
    2. indexOf(String ch) / indexOf(String ch, int fromIndex) : 문자열이 처음 등장하는 위치를 반환
    3. lastIndexOf(String ch) : 문자열이 마지막으로 등장하는 위치를 반환한다.

    문자열 조작 및 반환
    1. substring(int beginIndex) / substring (int beginIndex, int endIndex) : 문자열의 부분 문자열을 반환한다.
    2. concat : 문자열의 끝에 다른 문자열을 붙인다.
    3. replaceFirst(String str, String str1) : 문자열에서 정규 표현식과 일치하는 첫 번째 부분을 새 문자열로 대체 한다.
    4. replaceAll : 정규 표현식과 일치하는 부분을 새 문자열로 대체
    5. toLowerCase() / toUpperCase() : 소, 대문자 변환
    6. trim() : 문자열 양쪽 끝의 공백을 제거
    7. strip() : Whitespace와 유니코드 공백을 포함해서 제거한다.

    문자열 분할 및 조합
    1. split(String regex) : 문자열을 정규 포현식을 기준으로 분할
    2. join( ) : 주어진 구분자로 여러 문자열을 결합한다.

    기타 유틸리티
    1. valueOf(Object obj) : 다양한 타입을 문자열로 반환한다.
    2. toCharArray(): 문자열을 문자 배열로 변환한다.
    3. format( ) : 형식 문자열과 인자를 사용하여 새로운 문자열을 생성한다.
    4. matches(String regex) : 문자열이 주어진 정규 표현식과 일치하는지 확인한다.
     */
}
