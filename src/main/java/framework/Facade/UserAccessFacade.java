package framework.Facade;


import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class UserAccessFacade<T> implements DataAccess<T> {
	
	public static final String OUTPUT_DIR = System.getProperty("user.dir") 
			+ "/src/storage";
	private boolean isLibraryMemberExist(String id){
		File staffFolder = new File(OUTPUT_DIR.concat("/"));
		File sFiles[] = staffFolder.listFiles();
		for(File f:sFiles){
			if(f.getName().indexOf(id)==0){
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean saveData(T user,  String idPath) {
		ObjectOutputStream out = null;
		try{

			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR.concat("/"), idPath);
			out = new ObjectOutputStream(Files.newOutputStream(path));
			out.writeObject(user);
		}catch(IOException e){
			e.printStackTrace();

			}finally{
				if(out != null){
					try{
						out.close();
					}catch(Exception e){}
				}

		}
		return this.isLibraryMemberExist(idPath);
	}

	@Override
	public T readUser(Integer id) {
		ObjectInputStream in = null;
		T user = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR.concat("/"), id.toString());
			in = new ObjectInputStream(Files.newInputStream(path));
			user = (T)in.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch(Exception e) {}
			}
		}
		return user;
	}

}
