public class MusicLibrary {
    private Album[] library = new Album[10];
    private boolean x;

    public MusicLibrary() {
    }

    public String toString() {
        String a = "";
        for (int x = 0; x < library.length; x++) {
            if (library[x] != null)
                a += library[x].toString() + "\n";
            else
                a += "Empty\n";
        }

        return a;
    }

    public boolean add(Album album) {
        x = false;
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null && x == false) {
                library[i] = album;
                x = true;
            }
        }
        return x;
    }

    public boolean remove(int removed) {
        if (library[removed] != null) {
            library[removed] = null;
            return true;
        }
        return false;
    }

    public Album[] doubleSize() {
        int l = library.length;
        Album[] newLibrary = new Album[l];
        for (int i = 0; i < library.length; i++) {
            newLibrary[i] = library[i];
        }
        library = new Album[l * 2];
        for (int i = 0; i < newLibrary.length; i++) {
            library[i] = newLibrary[i];
        }
        return library;
    }

    public int findTitle(String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null && library[i].getName().equals(title))
                return i;
        }
        return -1;
    }

    public int findArtist(String artist) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null && library[i].getArtist().equals(artist))
                return i;
        }
        return -1;
    }

    public Album getAlbum(int index) {
        if (index >= 0 && index < library.length)
            return library[index];
        else
            System.out.println("Index Out of Bounds");
        return null;
    }

    public void sortByTitle() {
        Album temp;
        int min;
        for (int i = 0; i < library.length - 1; i++) {
            min = i;
            for (int scan = i + 1; scan < library.length; scan++) {
                if (library[scan] != null && library[i] != null) {
                    if (library[scan].getName().compareTo(library[min].getName()) < 0) {
                        min = scan;
                    }
                }
            }
            temp = library[min];
            library[min] = library[i];
            library[i] = temp;
        }
    }

    public void sortByArtist() {
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null) {
                Album artist = library[i];
                int position = i;

                while (position > 0 && library[position - 1].getArtist().compareTo(artist.getArtist()) > 0) {
                    library[position] = library[position - 1];
                    position--;
                }
                library[position] = artist;
            }
        }

    }
    public int binarySearch(String target, String type){
        int low =0;
        int high = library.length - 1;
        int middle = (low + high) /2;
        if(type.compareTo("artist") == 0){
            while (library[middle] == null) {
                high--;
                middle--;
            }

            while(library[middle].getArtist() != target && low <= high){
                if (target.compareTo(library[middle].getArtist()) < 0)
                    high = middle - 1;
                else
                    low = middle + 1;
                middle = (low + high)/2;
            }

            if (library[middle].getArtist().compareTo(target) == 0)
                return middle;
            else
                return -1;
        }
        else{
            while (library[middle] == null) {
                high--;
                middle--;
            }
            while(library[middle].getName() != target && low <= high){
                if (target.compareTo(library[middle].getName()) < 0)
                    high = middle - 1;
                else
                    low = middle + 1;
                middle = (low + high)/2;
            }

            if (library[middle].getName().compareTo(target) == 0)
                return middle;
            else
                return -1;
        }

    }
}



