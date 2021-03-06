package data;
// Generated Nov 20, 2014 9:23:46 PM by Hibernate Tools 4.3.1



/**
 * ShareVideoId generated by hbm2java
 */
public class ShareVideoId  implements java.io.Serializable {


     private int userId;
     private int videoId;

    public ShareVideoId() {
    }

    public ShareVideoId(int userId, int videoId) {
       this.userId = userId;
       this.videoId = videoId;
    }
   
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ShareVideoId) ) return false;
		 ShareVideoId castOther = ( ShareVideoId ) other; 
         
		 return (this.getUserId()==castOther.getUserId())
 && (this.getVideoId()==castOther.getVideoId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUserId();
         result = 37 * result + this.getVideoId();
         return result;
   }   


}


