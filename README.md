AstroBinAPI
===========

***This library is deprecated and no longer up to date with the current api.***

Android library for AstroBin.com ReST API.

Example usage: 

AstroBinApi api = new AstroBinApi(API_KEY, API_SECRET);

ArrayList<Image> images = api.getImages(where, limit, offset, orderby);

for (Image image : images) {

  String description = image.getDescription();

  ...

}
