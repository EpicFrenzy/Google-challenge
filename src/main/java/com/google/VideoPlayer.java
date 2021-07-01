package com.google;

public class VideoPlayer {
  int videoPlaying;
  {
    videoPlaying = 0;
  }


  String VideoTag;
  String VideoTagFull;
  int pause = 0;

  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
    System.out.println("Here's a list of all available videos:\n" +
            " Amazing Cats (amazing_cats_video_id) [#cat #animal]\n" +
            " Another Cat Video (another_cat_video_id) [#cat #animal]\n" +
            " Funny Dogs (funny_dogs_video_id) [#dog #animal]\n" +
            " Life at Google (life_at_google_video_id) [#google #career]\n" +
            " Video about nothing (nothing_video_id) []");
  }

  public void playVideo(String videoId) {
      switch (videoId) {
        case "amazing_cats_video_id":
          if (videoPlaying == 1) {
            System.out.println("Stopping video: " + VideoTag);
          }
          System.out.println("Playing video: Amazing Cats");
          VideoTag = "Amazing Cats";
          VideoTagFull = "Amazing Cats (amazing_cats_video_id) [#cat #animal]";
          videoPlaying = 1;
          break;
        case "another_cat_video_id":
          if (videoPlaying == 1) {
            System.out.println("Stopping video: " + VideoTag);
          }
          System.out.println("Playing video: Another Cat Video");
          VideoTag = "Another Cat Video";
          VideoTagFull = "Another Cat Video (another_cat_video_id) [#cat #animal]";
          videoPlaying = 1;
          break;
        case "funny_dogs_video_id":
          if (videoPlaying == 1) {
            System.out.println("Stopping video: " + VideoTag);
          }
          System.out.println("Playing video: Funny Dogs");
          VideoTag = "Funny Dogs";
          VideoTagFull = "Funny Dogs (funny_dogs_video_id) [#dog #animal]";
          videoPlaying = 1;
          break;
        case "life_at_google_video_id":
          if (videoPlaying == 1) {
            System.out.println("Stopping video: " + VideoTag);
          }
          System.out.println("Playing video: Life At Google");
          VideoTag = "Life At Google";
          VideoTagFull = "Life at Google (life_at_google_video_id) [#google #career]";
          videoPlaying = 1;
          break;
        case "nothing_video_id":
          if (videoPlaying == 1) {
            System.out.println("Stopping video: " + VideoTag);
          }
          System.out.println("Playing video: Video About Nothing");
          VideoTag = "Video About Nothing";
          VideoTagFull = "Video about nothing (nothing_video_id) []";
          videoPlaying = 1;
          break;
        default:
          System.out.println("Cannot play video: Video does not exist");
          break;
      }

  }
  public void stopVideo() {
    switch (videoPlaying) {
      case 1:
        System.out.println("Stopping video: " + VideoTag);
        videoPlaying = 0;
        break;
      case 0:
        System.out.println("Cannot stop video: No video is currently playing");
        break;
    }
  }

  public void playRandomVideo() {
    int randomNo = (int) (Math.random() * 5);
    switch(videoPlaying) {
      case 1:
        System.out.println("Stopping video: " + VideoTag);
      default:
    };
    videoPlaying = 1;
    switch(randomNo) {
      case 0:
        System.out.println("Playing video: Amazing Cats");
        VideoTag = "Amazing Cats";
        break;
      case 1:
        System.out.println("Playing video: Another Cat Video");
        VideoTag = "Another Cat Video";
        break;
      case 2:
        System.out.println("Playing video: Funny Dogs");
        VideoTag = "Funny Dogs";
        break;
      case 3:
        System.out.println("Playing video: Life At Google");
        VideoTag = "Life At Google";
        break;
      case 4:
        System.out.println("Playing video: Video About Nothing");
        VideoTag = "Video About Nothing";
        break;
    }
  }

  public void pauseVideo() {
    switch (pause) {
      case 0:
      switch (videoPlaying) {
        case 1:
          System.out.println("Pausing video: " + VideoTag);
          pause = 1;
          break;
        default:
          System.out.println("Cannot pause video: No video is currently playing");
          break;
      }
      break;
      default:
        System.out.println("Video already paused: " + VideoTag);
      break;
    }
  }

  public void continueVideo() {
        switch (videoPlaying) {
          case 1:
            switch (pause) {
              case 1:
            System.out.println("Continuing video: " + VideoTag);
            pause = 0;
            break;
          default:
            System.out.println("Cannot continue video: Video is not paused");
            break;
        }
        break;
      default:
        System.out.println("Cannot continue video: No video is currently playing");
        break;
    }
  }

  public void showPlaying() {
    switch(videoPlaying) {
      case 1:
        switch(pause) {
          case 0:
            System.out.println("Currently playing: " + VideoTagFull + " - PAUSED");
            break;
          default:
            System.out.println("Currently playing: " + VideoTagFull);
            break;
        }
      break;
      default:
        System.out.println("No video is currently playing");
        break;
    }
  }
  int i;
  int j;
  String[] playListArray = new String[]{ "1", "2", "3", "4", "5", "6", "7","8"
  };

  public void createPlaylist(String playlistName) {

    playListArray[i] = playlistName;
    int newPlaylist = 1; //Boolean variable
    for (j=0; j<=i;) {
      if (i != j) {
        if ((playListArray[j].toUpperCase()).equals((playListArray[i].toUpperCase()))) {
          System.out.println("Cannot create playlist: A playlist with the same name already exists");
          newPlaylist = 0;
          break;
        }
      }
      j = j + 1;
    }
    if (newPlaylist == 1) {
      System.out.println("Successfully created new playlist: " + playlistName);
      i = i + 1;
    }
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    int foundPlaylist = 0; //search
    for (j = 0; j <= i; ) {
      if ((playListArray[j].toUpperCase()).equals((playlistName.toUpperCase()))) {
        foundPlaylist = 1;
        break;
      }
      j = j + 1;
    }
    String[] songList = new String[]{"1", "2", "3", "4", "5"}; //playlist songs
    int AppropriateVideo = 1;
    int SongNo = 0;      // Some more boolean switches + Array pointers!
    int SongMatch = 0;
    if (foundPlaylist == 1) {
      switch (videoId) {
        case "amazing_cats_video_id":
          VideoTag = "Amazing Cats";
          break;
        case "another_cat_video_id":
          VideoTag = "Another Cat Video";
          break;
        case "funny_dogs_video_id":
          VideoTag = "Funny Dogs";
          break;
        case "life_at_google_video_id":
          VideoTag = "Life at Google";
          break;
        case "nothing_video_id":
          VideoTag = "Video About Nothing";
          break;
        default:
          AppropriateVideo = 0;
          break;
      }
      if (AppropriateVideo == 1) {

        for (j = 0; j <= i; ) {
          if (i != j) {
            if ((videoId.toUpperCase()).equals((songList[j].toUpperCase()))) {
              System.out.println("Cannot add video to " + playlistName + ": Video already added");
              SongMatch = 1;
              break;
            }
          }
          j = j + 1;
        }
        if (SongMatch == 0) {
          System.out.println("Added video to " + playlistName + ": " + VideoTag);
          songList[SongNo] = videoId;
        }
      }
    }
    if (foundPlaylist == 0) {
      System.out.println("Cannot add video to " + playlistName + ": Playlist does not exist");
    }
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}