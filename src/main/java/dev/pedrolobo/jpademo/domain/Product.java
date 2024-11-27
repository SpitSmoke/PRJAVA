package dev.pedrolobo.jpademo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length=12, nullable = false, unique = true)
  private String code;

  @Column(length=30, nullable = false)
  private String name;

  @Column(length=20, nullable = false)
  private String manufacturer;

  @Lob
  @Column(nullable = false)
  private String description;

  public Product(Long id, String code, String name, String manufacturer, String description){
    this.id = id;
    this.code = code;
    this.name = name;
    this.manufacturer = manufacturer;
    this.description = description;
  }

}
