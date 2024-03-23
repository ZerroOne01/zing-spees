package du_an_zingspeed;

abstract class RacingObject {
 private int id;
 private String name;
 private String description;

 public RacingObject(int id, String name, String description) {
     this.id = id;
     this.name = name;
     this.description = description;
 }

 // Getters and setters
 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public String getDescription() {
     return description;
 }

 public void setId(int id) {
     this.id = id;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setDescription(String description) {
     this.description = description;
 }
 public abstract void Nhap();


 public abstract void Xuat();
}

