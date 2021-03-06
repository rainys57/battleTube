package data;
// Generated Nov 20, 2014 9:23:46 PM by Hibernate Tools 4.3.1



/**
 * Video generated by hbm2java
 */
public class Video  implements java.io.Serializable {


     private int videoId;
     private String name;
     private String url;
     private String genre;
     private Integer sumVotes;
     private Integer likeVotes;
     private Integer dislikeVotes;

    public Video() {
    }

	
    public Video(int videoId) {
        this.videoId = videoId;
    }
    public Video(int videoId, String name, String url, String genre, Integer sumVotes, Integer likeVotes, Integer dislikeVotes) {
       this.videoId = videoId;
       this.name = name;
       this.url = url;
       this.genre = genre;
       this.sumVotes = sumVotes;
       this.likeVotes = likeVotes;
       this.dislikeVotes = dislikeVotes;
    }
   
    public int getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Integer getSumVotes() {
        return this.sumVotes;
    }
    
    public void setSumVotes(Integer sumVotes) {
        this.sumVotes = sumVotes;
    }
    public Integer getLikeVotes() {
        return this.likeVotes;
    }
    
    public void setLikeVotes(Integer likeVotes) {
        this.likeVotes = likeVotes;
    }
    public Integer getDislikeVotes() {
        return this.dislikeVotes;
    }
    
    public void setDislikeVotes(Integer dislikeVotes) {
        this.dislikeVotes = dislikeVotes;
    }




}


