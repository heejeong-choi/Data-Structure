## HashMap
> 맵(Map)의 특징인 키(key)와 값(value)을 묶어서 하나의 데이터(entry)로 저장한다는 특징을 갖고,
> 많은 양의 데이터를 검색하는데 있어 뛰어난 성능을 보인다.

```
public class HashMap extends AbstractMap implements Map, Cloneable, Serializable 
{
    transient Entry[] table;
    ...
    static class Entry implements Map.Entry 
    {
        final Object key;
        Object values;
            ...
    }
}
```

HashMap은 Entry라는 내부 클래스를 정의하고있고, 다시 Entry 타입의 배열을 선언하고 있다.
<br> 키와 값은 별개의 값이 아니라 서로 관련된 즉 한 쌍의 값이기 때문에 각각의 배열로 선언하기 보다는,
하나의 클래스로 정의해 하나의 배열로 다루는 것이 데이터의 무결성 측면에서 더 바람직 하다.


## Key와 Values
> HashMap은 키와 값을 각각 Object 타입으로 저장한다. 한마디로 어떠한 객체도 저장할 수 있지만,
> 키는 주로 String을 대문자 또는 소문자로 통일 하고 있다. 

### 키(Key)
    - 저장된 값을 찾는데 사용되는 것이 아니기 때문에, 컬렉션 내의 키(key) 중에서 유일해야 한다.
### 값(value)
    - 키(key)와 달리 데이터의 중복을 허용한다. 