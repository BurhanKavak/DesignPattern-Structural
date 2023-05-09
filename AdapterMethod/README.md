## :diamond_shape_with_a_dot_inside: Adapter Pattern

**Adapter Tasarım Deseni, farklı sınıfların bir arada çalışabilmesi için kullanılan bir yapısal tasarım desenidir. Bu desen, var olan bir sınıfın arayüzünü, başka bir sınıfın beklediği arayüzle eşleştirmek için kullanılır. Bu sayede, farklı sınıfların birbiriyle uyumlu hale getirilmesi mümkün olur.**

**Adapter Tasarım Deseni, bir çevirici görevi görür. Yani, uyumsuz iki sınıf arasında arabuluculuk yaparak, bir sınıfın kullanımını diğer sınıfa uyarlar. Bu sayede, iki sınıf birlikte çalışabilir hale gelir.**

**Adapter Tasarım Deseni, iki farklı türü vardır:**

1. **Class Adapter (Sınıf Adaptörü): Bu yöntemde, uyumsuz sınıfın miras alındığı bir sınıf yaratılır. Bu sınıf, uyumsuz sınıfın fonksiyonlarını kullanarak, arayüz uyumlu hale getirilir.**
2. **Object Adapter (Nesne Adaptörü): Bu yöntemde, uyumsuz sınıfın bir örneği, arayüz uyumlu bir nesne aracılığıyla kullanılır. Yani, bir adaptör sınıfı, uyumsuz nesneyi alarak, arayüz uyumlu hale getirir.**

**Adapter Tasarım Deseni'nin avantajları şunlardır:**

- **Var olan kodların tekrar kullanımını sağlar.**
- **Uyumlu hale getirilen sınıfların birlikte çalışabilmesini sağlar.**
- **Programlama hatalarını önler ve kodu daha okunaklı hale getirir.**
