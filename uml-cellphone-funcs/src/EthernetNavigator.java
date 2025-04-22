public record EthernetNavigator(String name) {
    public void showPages(String url) {
        System.out.println("infos da pagina" + url);
    }
    public void addNewTab() {
        System.out.println("Nova guia");
    }
    public void updatePage() {
        System.out.println("Reload na pagina");
    }
}