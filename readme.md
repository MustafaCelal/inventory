
# Inventory

![](/images/inventory.png)

Bu proje microservice yapısıyla oluşturulmuş e-ticaret projesinin envanter kısmıdır.
Veritabanındaki Ürün ve Categorileri listeler.
[Diğer projeler](#i̇lişkili-diğer-projeler)

## Kurulum

Bu projeyi bilgisayarınızda çalıştırmak için `java-11` in bilgisayarınızda kurulu olması gereklidir.

Aşağıdaki komutla kodları indirip derleyiciniz ile açabilirsiniz.

```git
git clone https://github.com/MustafaCelal/inventory.git
```
> Değiştirilmediği sürece "8081" portunda çalışır ve "fiba_inventory" adında "postgreSQL" veritabanı kullanır


---

<details>
<summary>API kullanımını görmek için tıklayın</summary>

## API Kullanımı

- #### Kategori getir

	Bütün kategorileri getirir
	```http
	GET /inventory/categories
	```

	Id'si verilen kategoriyi getirir
	```http
	GET /inventory/category/{categoryId}
	```

	| Parametre | Tip     | Açıklama                       |
	| :-------- | :------- | :-------------------------------- |
	| `id`      | `string` | **Gerekli**. Çağrılacak kategorinin id'si |


- #### Ürün getir

	Id'si verilen ürünü getirir
	```http
	GET /inventory/product/{productId}
	```

	| Parametre | Tip     | Açıklama                       |
	| :-------- | :------- | :-------------------------------- |
	| `id`      | `string` | **Gerekli**. Çağrılacak ürünün id'si |


	Verilen kategorideki bütün ürünleri getirir
	```http
	GET /inventory/products/{categoryId}
	```

	| Parametre | Tip     | Açıklama                       |
	| :-------- | :------- | :-------------------------------- |
	| `id`      | `string` | **Gerekli**. Çağrılacak ürünlerin kategori id'si |

</details>

---
[Postman Collection](https://github.com/MustafaCelal/inventory/blob/main/Inventory.postman_collection.json) bu dosyayı indirip postman'de import ederek resimlerde gördüğünüz isteklerin olduğu postman collection'ını kullanabilirsiniz.

---
<details open>
<summary>ekran görüntüleri </summary>


### bütün kategoriler
![bütün kategoriler](/images/b%C3%BCt%C3%BCn%20kategoriler.png)

### 1 id'li ürün
![1 id'li ürün](/images/1%20id'li%20%C3%BCr%C3%BCn.png)

### 1 id'li kategori
![1 id'li kategori](/images/1%20id'li%20kategori.png)

### 2 kategorisindeki ürünler
![2 kategorisindeki ürünler](/images/2%20kategorisindeki%20%C3%BCr%C3%BCnler.png)

### veritabanı tablolar
![veritabanı tablolar](/images/tablolar.png)

### veritabanı kategoriler
![veritabanı kategoriler](/images/db%20kategoriler.png)

### veritabanı ürünler
![veritabanı ürünler](/images/db%20%C3%BCr%C3%BCnler.png)

</details>


---
## İlişkili diğer Projeler

[Commerce](https://github.com/MustafaCelal/commerce)

[Shopping](https://github.com/MustafaCelal/shopping)

  