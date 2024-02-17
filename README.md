## Система управления складом
- **Single Responsibility Principle**.
Класс BaseProduct (name, quantity, price, category) отвечает только за хранение информации о товаре. Класс ProductDetail (characterName и value) хранит информацию о характеристке товара.
- **Open-Closed Principle**.
Созданы интерфейсы ProductInterface и Detail
- **Liskov Substitution Principle**. Создан дочерний класс Dairy, который наследуется от BaseProduct.
- **Interface Segregation Principle**. Созданы разные интерфейсы для управления количеством товара, добавлением/удалением товара на склад, обработкой заказа.
- **Dependency Inversion Principle**. Классы ListView и ProductView.
