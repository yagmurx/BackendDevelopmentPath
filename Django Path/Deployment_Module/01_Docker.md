# DOCKER
## Neden Docker'a İhtiyacımız var?
- Harware Infrastructure
- Operating System
- Libraries & Dependencies
- Components
  - Web Server (ex: node.js, express)
  - Frontend (ex: Vue.js)
  - Database (ex: MongoDB)
  - Cache (ex: redis)
  - Monitoring (ex: grafana)

- Kütüphane ve bağımlılıkların birbirlerini etkilemesi
- Tüm servisler (component) uyumlu işletim sistemine sahip olmalı
- Servis güncellendiğinde ona uygun olan işletim sistemi ve bağımlılıkların bulunması
- Geliştirme ortamı oldukça zor ve zaman maliyeti var

Case: Linux bir OS üzerine X ve X servislerini kurdunuz. Bunlar siz uygulamayı yazarken gayet uyumlu çalışıyorlardı ancak ürün ortamına aldığınız zaman program çalışmamaya başladı. Neden? Bunun pek çok nedeni olabilir ama temelinde geliştirme ortamıyla ürün ortamındaki componentlerin sürümlerinin uyumlu olmaması bulunur.

Docker ile tüm servisler kütüphaneleri ve bağımlılıklarıyla birlikte kendi ortamlarında (container) barınırlar ve aynı işletim sistemi üzerinde uyumla çalışırlar. Docker containerlar ve işletim sistemi arasındaki aracıdır.

**Container nedir?**
Kendilerine ait prosesleri (processes), servisleri (services) ve ağları (network) olan aynı işletim sistemi veya Virtual Machine (VM) üzerinde çalışan izole edilmiş ortamlardır. Containerların çalıştığı yerde tek bir işletim sistemi vardır, containerlar os'un Kernel'ını (çekirdek kodu) paylaşırlar. Container yönetimi oldukça zor ve low level bir iştir. Docker burada devreye girer ve işi kolaylaştırmak için bir çok high level araç sunar.

*Container vs VM*
Containerlar sadece yazılım bileşenleri barındırır ve işletim sistemiyle bağ kurarken docker kullanır. VM'ler ise yazılım bileşenleri ve işletim sistemi barındırır, donanım katmanıyla konuşmak için hypervisor kullanır. Containerlar düşük RAM, CPU ve depolama alanı kullanırken VM'lerin yüksek bir kullanımı vardır. Container mimarisinde her zaman çalışan bir os olduğu için ayağa kalkma süresi sadece containerdaki bileşen kadardır. VM'de sıfırdan işletim sistemi de başlatıldığı için daha uzun sürer.

**Image nedir?**
Containerın neleri çalıştıracağını hangi özelliklere sahip olacağını söyleyen template gibi düşünebileceğimiz yapılardır. İçerisinde bir çok farklı yapıyı (örneğin işletim sistemi, uygulamalar vb.) barındıran yapılardır. Docker Imageler geliştiriciler tarafından geliştirilir ve Docker Hub üzerinden edinilebilir.

*Container ve Image*
Container Image'ı çalıştırdığımızda elde ettiğimiz ortamdır. Yani bir image'i çalıştırıdığımızda gördüğümüz ve kullandığımız şey containerdır. Bir Image ile birden fazla container çalıştırılabilir.

**Docker Hub nedir? **
Bileşenlerinizi kullamak için ihtiyacınız olan image dosyalarını Docker Host'unuza Docker Hub ile edinirsiniz.
