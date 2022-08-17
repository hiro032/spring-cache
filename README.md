# spring-cache

## Cache Manager

캐시 추상화에서는 캐시 기술을 지원하는 캐시 매니저를 빈으로 등록해야 합니다.

 
### ✔️ ConcurrentMapCacheManager

- ConcurrentHashMap을 이용해 캐시 기능을 구현하는 간단한 캐시 매니저입니다. </br>
- 캐시 정보를 Map 타입으로 메모리에 저장해두기 때문에 빠르고 별다른 설정이 필요없다는 장점이 있지만, 실제 서비스에서 사용하기에는 기능이 빈약합니다.
 
### ✔️ SimpleCacheManager
- 기본적으로 제공하는 캐시가 없습니다. </br>
- 사용할 캐시를 직접 등록하여 사용하기 위한 캐시 매니저입니다.</br>

 
### ✔️ EhCacheCacheManager
- 자바에서 유명한 캐시 프레임워크 중 하나인 EhCache를 지원하는 캐시 매니저입니다.</br>
 
### ✔️ CaffeineCacheManager
- Java 8로 Guava 캐시를 재작성한 Caffeine 캐시를 사용하는 캐시 매니저입니다.</br>
- EhCache와 함께 인기 있는 캐시 매니저인데, EhCache보다 좋은 성능을 갖는다고 해서 최근 많이 사용합니다.</br>

 
### ✔️ CompositeCacheManager
- 한 개 이상의 캐시 매니저를 사용하도록 지원해주는 혼합 캐시 매니저입니다.</br>

 
### ✔️ JCacheCacheManager
- JSR-107 기반의 캐시를 사용하는 캐시 매니저입니다.</br>
