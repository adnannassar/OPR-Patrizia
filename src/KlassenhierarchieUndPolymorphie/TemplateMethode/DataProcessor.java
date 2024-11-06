package KlassenhierarchieUndPolymorphie.TemplateMethode;

abstract class DataProcessor {
    // Template Method - defines the structure of the algorithm
    public final void processData() {
        loadData();
        processDataDetails();
        saveData();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void loadData();
    protected abstract void processDataDetails();

    // A concrete method - shared step
    protected void saveData() {
        System.out.println("Saving data...");
    }
}

class CSVDataProcessor extends DataProcessor {
    @Override
    protected void loadData() {
        System.out.println("Loading data from CSV...");
    }

    @Override
    protected void processDataDetails() {
        System.out.println("Processing CSV data...");
    }
}

class XMLDataProcessor extends DataProcessor {
    @Override
    protected void loadData() {
        System.out.println("Loading data from XML...");
    }

    @Override
    protected void processDataDetails() {
        System.out.println("Processing XML data...");
    }
}
