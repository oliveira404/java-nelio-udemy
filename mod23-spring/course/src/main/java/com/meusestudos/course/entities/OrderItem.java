package com.meusestudos.course.entities;

import com.meusestudos.course.entities.pk.OrderItemPk;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
//@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @EqualsAndHashCode.Include
    @EmbeddedId
    private OrderItemPk id;

    //@NonNull
    private Integer quantity;

    //@NonNull
    private Double price;

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        this.id.setOrder(order);
        this.id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public Order getOrder() {
        return this.id.getOrder();
    }

    public void setOrder(Order order) {
        this.id.setOrder(order);
    }

    public Product getProduct() {
        return this.id.getProduct();
    }

    public void setProduct(Product product) {
        this.id.setProduct(product);
    }
}