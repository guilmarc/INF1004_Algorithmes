package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainViewController {

    //Views
    @FXML TableView<Driver> tableView;
    @FXML TableColumn<Driver, String> driverIDColumn;
    @FXML TableColumn<Driver, String> firstNameColumn;
    @FXML TableColumn<Driver, String> lastNameColumn;
    @FXML TableColumn<Driver, Integer> hiredInColumn;
    @FXML TableColumn<Driver, String> addressColumn;

    private ObservableList<Driver> drivers = FXCollections.observableArrayList();

    private Main main;

    public void initialize(){
        driverIDColumn.setCellValueFactory(new PropertyValueFactory<Driver, String>("driverID"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Driver, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Driver, String>("lastName"));
        hiredInColumn.setCellValueFactory(new PropertyValueFactory<Driver, Integer>("hiredIn"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<Driver, String>("address"));


        drivers.add(new Driver("Munoz", "Armando", 2015, "4698 rue Fournier (St-Jerôme)  J7Z 4V1"));
        drivers.add(new Driver("Summers", "Gabriel", 2015, "3589 avenue Port-Royal (Bonaventure)  G0C 1E1"));
        drivers.add(new Driver("Nathan", "Christopher", 2011, "4457 rue des Églises Est (St Paul D)  J0E 1A0"));
        drivers.add(new Driver("Beaubier", "Jean-Paul", 2012, "797 Rue De La Gare (Mistassini)  G8M 2Z2"));
        drivers.add(new Driver("Marko", "Cain", 2012, "3525 90th Avenue (Brooks)  T0J 0J0"));
        drivers.add(new Driver("Haller", "David", 2015, "2536 Pape Ave (Toronto)  M4E 2V5"));
        drivers.add(new Driver("Ferguson", "Clarice", 2015, "4888 Pine Street (Castor)  T0C 0X0"));
        drivers.add(new Driver("Hunter", "Stephanie", 2013, "3746 Adelaide St (Toronto)  M5H 1P6"));
        drivers.add(new Driver("Hark", "Paul", 2012, "2515 102nd Avenue (Fort St John)  V1J 3Y7"));
        drivers.add(new Driver("Dane", "Lorna", 2010, "1211 Carling Avenue (Ottawa)  K1Z 7B5"));
    }

    public void setMain(Main main){
        this.main = main;

        System.out.println("*NOMBRE*" + main.company.getDrivers().size());

        tableView.setItems(main.company.getDrivers());
    }

}
