## :diamond_shape_with_a_dot_inside: Facade Pattern


**Facade tasarım deseni bir yapısal tasarım desenidir ve bir sistem veya alt sistemin parçalarını oluşturan classları istemciden soyutlayarak kullanımı daha da kolaylaştırmak için tasarlanmış tasarım kalıbıdır. Mimarisel açıdan ise, karmaşık ve detaylı bir sistemi organize eden ve bir bütün olarak clientlara(istemcilere) sunan yapıdır. Anlayacağınız, karmaşık ve detaylı olarak nitelendirdiğimiz bu sistemi bir alt sistem olarak varsayarsak eğer bu sistemi kullanacak clientlara daha basit bir arayüz sağlamak ve alt sistemleri bu arayüze organize bir şekilde dahil etmek ve bu alt sistemlerin sağlıklı çalışabilmesi için bu arayüz çatısı altında işin algoritmasına uygun işlev sergilemek istersek Facade Design Pattern’i kullanmaktayız.**

**Facade, bir sisteme özgü arayüzleri saklar ve kullanıcılara yalnızca kolay bir arayüz sağlar. Böylece kullanıcılar, altta yatan sistemin nasıl çalıştığına dair ayrıntıları bilmek zorunda kalmazlar. Facade, sistemin daha geniş bir parçasına veya daha karmaşık bir alt sistemine sahip olan müşteriler için kolay bir arayüz sağlar.**

**Facade tasarım deseninin bazı avantajları şunlardır:**

- **Kullanıcılara daha basit bir arayüz sunar: Facade, bir sistemin karmaşık yapısını saklar ve kullanıcılara daha basit bir arayüz sunar. Kullanıcılar, sistem veya alt sistem hakkında ayrıntılı bilgiye sahip olmak zorunda kalmazlar.**
- **Alt sistemlerin değiştirilmesini kolaylaştırır: Facade, alt sistemlerin daha iyi bir şekilde değiştirilmesine izin verir. Yeni bir alt sistem eklendiğinde, kullanıcıların kodlarında yapacakları değişiklikler en aza indirgenir.**
- **Kod tekrarını azaltır: Facade, kod tekrarını önlemeye yardımcı olur. Sistem içindeki birçok farklı bileşen kullanılıyorsa, Facade arayüzü, bu bileşenlerin tekrar kullanımını sağlar.**