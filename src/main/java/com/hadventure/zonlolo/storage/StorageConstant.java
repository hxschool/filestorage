/*
 * Copyright (c) 2013 北京海达网畅信息技术开发有限公司（www.hadventure.com）. All rights reserved.
 * 
 * HADVENTURE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.hadventure.zonlolo.storage;

import java.util.HashMap;
import java.util.Map;

/**
 * Constants for zonlolo binary storage.
 * 
 * @author <a href="mailto:zhigang.pi@hadventure.com">pprun</a>
 */
public class StorageConstant {
    // create_by

    public static final String CREATE_BY_STORAGE = "zonlolo-storage";
    // image mime type
    public static final String MIME_IMAGE_PNG = "image/png";
    public static final String MIME_IMAGE_JPG = "image/jpg";
    public static final String MIME_IMAGE_JPEG = "image/jpeg";
    public static final String MIME_IMAGE_GIF = "image/gif";
    // audio mime type
    public static final String MIME_AUDIO_WAV = "audio/x-wav";
    public static final String MIME_ARCHIVE_ZIP = "application/zip";
    public static final String MIME_EXCEL = "application/vnd.ms-excel";
    
    public static final Map<String,String> MimetypesFileTypeMap = new HashMap<String,String>();
    static {
    	MimetypesFileTypeMap.put(".*","application/octet-stream");
    	MimetypesFileTypeMap.put("0.001","application/x-001");
    	MimetypesFileTypeMap.put("0.323","text/h323");
    	MimetypesFileTypeMap.put("0.907","drawing/907");
    	MimetypesFileTypeMap.put(".acp","audio/x-mei-aac");
    	MimetypesFileTypeMap.put(".aif","audio/aiff");
    	MimetypesFileTypeMap.put(".aiff","audio/aiff");
    	MimetypesFileTypeMap.put(".asa","text/asa");
    	MimetypesFileTypeMap.put(".asp","text/asp");
    	MimetypesFileTypeMap.put(".au","audio/basic");
    	MimetypesFileTypeMap.put(".awf","application/vnd.adobe.workflow");
    	MimetypesFileTypeMap.put(".bmp","application/x-bmp");
    	MimetypesFileTypeMap.put(".c4t","application/x-c4t");
    	MimetypesFileTypeMap.put(".cal","application/x-cals");
    	MimetypesFileTypeMap.put(".cdf","application/x-netcdf");
    	MimetypesFileTypeMap.put(".cel","application/x-cel");
    	MimetypesFileTypeMap.put(".cg4","application/x-g4");
    	MimetypesFileTypeMap.put(".cit","application/x-cit");
    	MimetypesFileTypeMap.put(".cml","text/xml");
    	MimetypesFileTypeMap.put(".cmx","application/x-cmx");
    	MimetypesFileTypeMap.put(".crl","application/pkix-crl");
    	MimetypesFileTypeMap.put(".csi","application/x-csi");
    	MimetypesFileTypeMap.put(".cut","application/x-cut");
    	MimetypesFileTypeMap.put(".dbm","application/x-dbm");
    	MimetypesFileTypeMap.put(".dcd","text/xml");
    	MimetypesFileTypeMap.put(".der","application/x-x509-ca-cert");
    	MimetypesFileTypeMap.put(".dib","application/x-dib");
    	MimetypesFileTypeMap.put(".doc","application/msword");
    	MimetypesFileTypeMap.put(".drw","application/x-drw");
    	MimetypesFileTypeMap.put(".dwf","Model/vnd.dwf");
    	MimetypesFileTypeMap.put(".dwg","application/x-dwg");
    	MimetypesFileTypeMap.put(".dxf","application/x-dxf");
    	MimetypesFileTypeMap.put(".emf","application/x-emf");
    	MimetypesFileTypeMap.put(".ent","text/xml");
    	MimetypesFileTypeMap.put(".eps","application/x-ps");
    	MimetypesFileTypeMap.put(".etd","application/x-ebx");
    	MimetypesFileTypeMap.put(".fax","image/fax");
    	MimetypesFileTypeMap.put(".fif","application/fractals");
    	MimetypesFileTypeMap.put(".frm","application/x-frm");
    	MimetypesFileTypeMap.put(".gbr","application/x-gbr");
    	MimetypesFileTypeMap.put(".gif","image/gif");
    	MimetypesFileTypeMap.put(".gp4","application/x-gp4");
    	MimetypesFileTypeMap.put(".hmr","application/x-hmr");
    	MimetypesFileTypeMap.put(".hpl","application/x-hpl");
    	MimetypesFileTypeMap.put(".hrf","application/x-hrf");
    	MimetypesFileTypeMap.put(".htc","text/x-component");
    	MimetypesFileTypeMap.put(".html","text/html");
    	MimetypesFileTypeMap.put(".htx","text/html");
    	MimetypesFileTypeMap.put(".ico","image/x-icon");
    	MimetypesFileTypeMap.put(".iff","application/x-iff");
    	MimetypesFileTypeMap.put(".igs","application/x-igs");
    	MimetypesFileTypeMap.put(".img","application/x-img");
    	MimetypesFileTypeMap.put(".isp","application/x-internet-signup");
    	MimetypesFileTypeMap.put(".java","java/*");
    	MimetypesFileTypeMap.put(".jpe","image/jpeg");
    	MimetypesFileTypeMap.put(".jpeg","image/jpeg");
    	MimetypesFileTypeMap.put(".jpg","application/x-jpg");
    	MimetypesFileTypeMap.put(".jsp","text/html");
    	MimetypesFileTypeMap.put(".lar","application/x-laplayer-reg");
    	MimetypesFileTypeMap.put(".lavs","audio/x-liquid-secure");
    	MimetypesFileTypeMap.put(".lmsff","audio/x-la-lms");
    	MimetypesFileTypeMap.put(".ltr","application/x-ltr");
    	MimetypesFileTypeMap.put(".m2v","video/x-mpeg");
    	MimetypesFileTypeMap.put(".m4e","video/mpeg4");
    	MimetypesFileTypeMap.put(".man","application/x-troff-man");
    	MimetypesFileTypeMap.put(".mdb","application/msaccess");
    	MimetypesFileTypeMap.put(".mfp","application/x-shockwave-flash");
    	MimetypesFileTypeMap.put(".mhtml","message/rfc822");
    	MimetypesFileTypeMap.put(".mid","audio/mid");
    	MimetypesFileTypeMap.put(".mil","application/x-mil");
    	MimetypesFileTypeMap.put(".mnd","audio/x-musicnet-download");
    	MimetypesFileTypeMap.put(".mocha","application/x-javascript");
    	MimetypesFileTypeMap.put(".mp1","audio/mp1");
    	MimetypesFileTypeMap.put(".mp2v","video/mpeg");
    	MimetypesFileTypeMap.put(".mp4","video/mpeg4");
    	MimetypesFileTypeMap.put(".mpd","application/vnd.ms-project");
    	MimetypesFileTypeMap.put(".mpeg","video/mpg");
    	MimetypesFileTypeMap.put(".mpga","audio/rn-mpeg");
    	MimetypesFileTypeMap.put(".mps","video/x-mpeg");
    	MimetypesFileTypeMap.put(".mpv","video/mpg");
    	MimetypesFileTypeMap.put(".mpw","application/vnd.ms-project");
    	MimetypesFileTypeMap.put(".mtx","text/xml");
    	MimetypesFileTypeMap.put(".net","image/pnetvue");
    	MimetypesFileTypeMap.put(".nws","message/rfc822");
    	MimetypesFileTypeMap.put(".out","application/x-out");
    	MimetypesFileTypeMap.put(".p12","application/x-pkcs12");
    	MimetypesFileTypeMap.put(".p7c","application/pkcs7-mime");
    	MimetypesFileTypeMap.put(".p7r","application/x-pkcs7-certreqresp");
    	MimetypesFileTypeMap.put(".pc5","application/x-pc5");
    	MimetypesFileTypeMap.put(".pcl","application/x-pcl");
    	MimetypesFileTypeMap.put(".pdf","application/pdf");
    	MimetypesFileTypeMap.put(".pdx","application/vnd.adobe.pdx");
    	MimetypesFileTypeMap.put(".pgl","application/x-pgl");
    	MimetypesFileTypeMap.put(".pko","application/vnd.ms-pki.pko");
    	MimetypesFileTypeMap.put(".plg","text/html");
    	MimetypesFileTypeMap.put(".plt","application/x-plt");
    	MimetypesFileTypeMap.put(".png","application/x-png");
    	MimetypesFileTypeMap.put(".ppa","application/vnd.ms-powerpoint");
    	MimetypesFileTypeMap.put(".pps","application/vnd.ms-powerpoint");
    	MimetypesFileTypeMap.put(".ppt","application/x-ppt");
    	MimetypesFileTypeMap.put(".prf","application/pics-rules");
    	MimetypesFileTypeMap.put(".prt","application/x-prt");
    	MimetypesFileTypeMap.put(".ps","application/postscript");
    	MimetypesFileTypeMap.put(".pwz","application/vnd.ms-powerpoint");
    	MimetypesFileTypeMap.put(".ra","audio/vnd.rn-realaudio");
    	MimetypesFileTypeMap.put(".ras","application/x-ras");
    	MimetypesFileTypeMap.put(".rdf","text/xml");
    	MimetypesFileTypeMap.put(".red","application/x-red");
    	MimetypesFileTypeMap.put(".rjs","application/vnd.rn-realsystem-rjs");
    	MimetypesFileTypeMap.put(".rlc","application/x-rlc");
    	MimetypesFileTypeMap.put(".rm","application/vnd.rn-realmedia");
    	MimetypesFileTypeMap.put(".rmi","audio/mid");
    	MimetypesFileTypeMap.put(".rmm","audio/x-pn-realaudio");
    	MimetypesFileTypeMap.put(".rms","application/vnd.rn-realmedia-secure");
    	MimetypesFileTypeMap.put(".rmx","application/vnd.rn-realsystem-rmx");
    	MimetypesFileTypeMap.put(".rp","image/vnd.rn-realpix");
    	MimetypesFileTypeMap.put(".rsml","application/vnd.rn-rsml");
    	MimetypesFileTypeMap.put(".rtf","application/msword");
    	MimetypesFileTypeMap.put(".rv","video/vnd.rn-realvideo");
    	MimetypesFileTypeMap.put(".sat","application/x-sat");
    	MimetypesFileTypeMap.put(".sdw","application/x-sdw");
    	MimetypesFileTypeMap.put(".slb","application/x-slb");
    	MimetypesFileTypeMap.put(".slk","drawing/x-slk");
    	MimetypesFileTypeMap.put(".smil","application/smil");
    	MimetypesFileTypeMap.put(".snd","audio/basic");
    	MimetypesFileTypeMap.put(".sor","text/plain");
    	MimetypesFileTypeMap.put(".spl","application/futuresplash");
    	MimetypesFileTypeMap.put(".ssm","application/streamingmedia");
    	MimetypesFileTypeMap.put(".stl","application/vnd.ms-pki.stl");
    	MimetypesFileTypeMap.put(".sty","application/x-sty");
    	MimetypesFileTypeMap.put(".swf","application/x-shockwave-flash");
    	MimetypesFileTypeMap.put(".tg4","application/x-tg4");
    	MimetypesFileTypeMap.put(".tif","image/tiff");
    	MimetypesFileTypeMap.put(".tiff","image/tiff");
    	MimetypesFileTypeMap.put(".top","drawing/x-top");
    	MimetypesFileTypeMap.put(".tsd","text/xml");
    	MimetypesFileTypeMap.put(".uin","application/x-icq");
    	MimetypesFileTypeMap.put(".vcf","text/x-vcard");
    	MimetypesFileTypeMap.put(".vdx","application/vnd.visio");
    	MimetypesFileTypeMap.put(".vpg","application/x-vpeg005");
    	MimetypesFileTypeMap.put(".vsd","application/x-vsd");
    	MimetypesFileTypeMap.put(".vst","application/vnd.visio");
    	MimetypesFileTypeMap.put(".vsw","application/vnd.visio");
    	MimetypesFileTypeMap.put(".vtx","application/vnd.visio");
    	MimetypesFileTypeMap.put(".wav","audio/wav");
    	MimetypesFileTypeMap.put(".wb1","application/x-wb1");
    	MimetypesFileTypeMap.put(".wb3","application/x-wb3");
    	MimetypesFileTypeMap.put(".wiz","application/msword");
    	MimetypesFileTypeMap.put(".wk4","application/x-wk4");
    	MimetypesFileTypeMap.put(".wks","application/x-wks");
    	MimetypesFileTypeMap.put(".wma","audio/x-ms-wma");
    	MimetypesFileTypeMap.put(".wmf","application/x-wmf");
    	MimetypesFileTypeMap.put(".wmv","video/x-ms-wmv");
    	MimetypesFileTypeMap.put(".wmz","application/x-ms-wmz");
    	MimetypesFileTypeMap.put(".wpd","application/x-wpd");
    	MimetypesFileTypeMap.put(".wpl","application/vnd.ms-wpl");
    	MimetypesFileTypeMap.put(".wr1","application/x-wr1");
    	MimetypesFileTypeMap.put(".wrk","application/x-wrk");
    	MimetypesFileTypeMap.put(".ws2","application/x-ws");
    	MimetypesFileTypeMap.put(".wsdl","text/xml");
    	MimetypesFileTypeMap.put(".xdp","application/vnd.adobe.xdp");
    	MimetypesFileTypeMap.put(".xfd","application/vnd.adobe.xfd");
    	MimetypesFileTypeMap.put(".xhtml","text/html");
    	MimetypesFileTypeMap.put(".xls","application/x-xls");
    	MimetypesFileTypeMap.put(".xml","text/xml");
    	MimetypesFileTypeMap.put(".xq","text/xml");
    	MimetypesFileTypeMap.put(".xquery","text/xml");
    	MimetypesFileTypeMap.put(".xsl","text/xml");
    	MimetypesFileTypeMap.put(".xwd","application/x-xwd");
    	MimetypesFileTypeMap.put(".sis","application/vnd.symbian.install");
    	MimetypesFileTypeMap.put(".x_t","application/x-x_t");
    	MimetypesFileTypeMap.put(".apk","application/vnd.android.package-archive");
    	MimetypesFileTypeMap.put(".tif","image/tiff");
    	MimetypesFileTypeMap.put("0.301","application/x-301");
    	MimetypesFileTypeMap.put("0.906","application/x-906");
    	MimetypesFileTypeMap.put(".a11","application/x-a11");
    	MimetypesFileTypeMap.put(".ai","application/postscript");
    	MimetypesFileTypeMap.put(".aifc","audio/aiff");
    	MimetypesFileTypeMap.put(".anv","application/x-anv");
    	MimetypesFileTypeMap.put(".asf","video/x-ms-asf");
    	MimetypesFileTypeMap.put(".asx","video/x-ms-asf");
    	MimetypesFileTypeMap.put(".avi","video/avi");
    	MimetypesFileTypeMap.put(".biz","text/xml");
    	MimetypesFileTypeMap.put(".bot","application/x-bot");
    	MimetypesFileTypeMap.put(".c90","application/x-c90");
    	MimetypesFileTypeMap.put(".cat","application/vnd.ms-pki.seccat");
    	MimetypesFileTypeMap.put(".cdr","application/x-cdr");
    	MimetypesFileTypeMap.put(".cer","application/x-x509-ca-cert");
    	MimetypesFileTypeMap.put(".cgm","application/x-cgm");
    	MimetypesFileTypeMap.put(".class","java/*");
    	MimetypesFileTypeMap.put(".cmp","application/x-cmp");
    	MimetypesFileTypeMap.put(".cot","application/x-cot");
    	MimetypesFileTypeMap.put(".crt","application/x-x509-ca-cert");
    	MimetypesFileTypeMap.put(".css","text/css");
    	MimetypesFileTypeMap.put(".dbf","application/x-dbf");
    	MimetypesFileTypeMap.put(".dbx","application/x-dbx");
    	MimetypesFileTypeMap.put(".dcx","application/x-dcx");
    	MimetypesFileTypeMap.put(".dgn","application/x-dgn");
    	MimetypesFileTypeMap.put(".dll","application/x-msdownload");
    	MimetypesFileTypeMap.put(".dot","application/msword");
    	MimetypesFileTypeMap.put(".dtd","text/xml");
    	MimetypesFileTypeMap.put(".dwf","application/x-dwf");
    	MimetypesFileTypeMap.put(".dxb","application/x-dxb");
    	MimetypesFileTypeMap.put(".edn","application/vnd.adobe.edn");
    	MimetypesFileTypeMap.put(".eml","message/rfc822");
    	MimetypesFileTypeMap.put(".epi","application/x-epi");
    	MimetypesFileTypeMap.put(".eps","application/postscript");
    	MimetypesFileTypeMap.put(".exe","application/x-msdownload");
    	MimetypesFileTypeMap.put(".fdf","application/vnd.fdf");
    	MimetypesFileTypeMap.put(".fo","text/xml");
    	MimetypesFileTypeMap.put(".g4","application/x-g4");
    	MimetypesFileTypeMap.put(".","application/x-");
    	MimetypesFileTypeMap.put(".gl2","application/x-gl2");
    	MimetypesFileTypeMap.put(".hgl","application/x-hgl");
    	MimetypesFileTypeMap.put(".hpg","application/x-hpgl");
    	MimetypesFileTypeMap.put(".hqx","application/mac-binhex40");
    	MimetypesFileTypeMap.put(".hta","application/hta");
    	MimetypesFileTypeMap.put(".htm","text/html");
    	MimetypesFileTypeMap.put(".htt","text/webviewhtml");
    	MimetypesFileTypeMap.put(".icb","application/x-icb");
    	MimetypesFileTypeMap.put(".ico","application/x-ico");
    	MimetypesFileTypeMap.put(".ig4","application/x-g4");
    	MimetypesFileTypeMap.put(".iii","application/x-iphone");
    	MimetypesFileTypeMap.put(".ins","application/x-internet-signup");
    	MimetypesFileTypeMap.put(".IVF","video/x-ivf");
    	MimetypesFileTypeMap.put(".jfif","image/jpeg");
    	MimetypesFileTypeMap.put(".jpe","application/x-jpe");
    	MimetypesFileTypeMap.put(".jpg","image/jpeg");
    	MimetypesFileTypeMap.put(".js","application/x-javascript");
    	MimetypesFileTypeMap.put(".la1","audio/x-liquid-file");
    	MimetypesFileTypeMap.put(".latex","application/x-latex");
    	MimetypesFileTypeMap.put(".lbm","application/x-lbm");
    	MimetypesFileTypeMap.put(".ls","application/x-javascript");
    	MimetypesFileTypeMap.put(".m1v","video/x-mpeg");
    	MimetypesFileTypeMap.put(".m3u","audio/mpegurl");
    	MimetypesFileTypeMap.put(".mac","application/x-mac");
    	MimetypesFileTypeMap.put(".math","text/xml");
    	MimetypesFileTypeMap.put(".mdb","application/x-mdb");
    	MimetypesFileTypeMap.put(".mht","message/rfc822");
    	MimetypesFileTypeMap.put(".mi","application/x-mi");
    	MimetypesFileTypeMap.put(".midi","audio/mid");
    	MimetypesFileTypeMap.put(".mml","text/xml");
    	MimetypesFileTypeMap.put(".mns","audio/x-musicnet-stream");
    	MimetypesFileTypeMap.put(".movie","video/x-sgi-movie");
    	MimetypesFileTypeMap.put(".mp2","audio/mp2");
    	MimetypesFileTypeMap.put(".mp3","audio/mp3");
    	MimetypesFileTypeMap.put(".mpa","video/x-mpg");
    	MimetypesFileTypeMap.put(".mpe","video/x-mpeg");
    	MimetypesFileTypeMap.put(".mpg","video/mpg");
    	MimetypesFileTypeMap.put(".mpp","application/vnd.ms-project");
    	MimetypesFileTypeMap.put(".mpt","application/vnd.ms-project");
    	MimetypesFileTypeMap.put(".mpv2","video/mpeg");
    	MimetypesFileTypeMap.put(".mpx","application/vnd.ms-project");
    	MimetypesFileTypeMap.put(".mxp","application/x-mmxp");
    	MimetypesFileTypeMap.put(".nrf","application/x-nrf");
    	MimetypesFileTypeMap.put(".odc","text/x-ms-odc");
    	MimetypesFileTypeMap.put(".p10","application/pkcs10");
    	MimetypesFileTypeMap.put(".p7b","application/x-pkcs7-certificates");
    	MimetypesFileTypeMap.put(".p7m","application/pkcs7-mime");
    	MimetypesFileTypeMap.put(".p7s","application/pkcs7-signature");
    	MimetypesFileTypeMap.put(".pci","application/x-pci");
    	MimetypesFileTypeMap.put(".pcx","application/x-pcx");
    	MimetypesFileTypeMap.put(".pdf","application/pdf");
    	MimetypesFileTypeMap.put(".pfx","application/x-pkcs12");
    	MimetypesFileTypeMap.put(".pic","application/x-pic");
    	MimetypesFileTypeMap.put(".pl","application/x-perl");
    	MimetypesFileTypeMap.put(".pls","audio/scpls");
    	MimetypesFileTypeMap.put(".png","image/png");
    	MimetypesFileTypeMap.put(".pot","application/vnd.ms-powerpoint");
    	MimetypesFileTypeMap.put(".ppm","application/x-ppm");
    	MimetypesFileTypeMap.put(".ppt","application/vnd.ms-powerpoint");
    	MimetypesFileTypeMap.put(".pr","application/x-pr");
    	MimetypesFileTypeMap.put(".prn","application/x-prn");
    	MimetypesFileTypeMap.put(".ps","application/x-ps");
    	MimetypesFileTypeMap.put(".ptn","application/x-ptn");
    	MimetypesFileTypeMap.put(".r3t","text/vnd.rn-realtext3d");
    	MimetypesFileTypeMap.put(".ram","audio/x-pn-realaudio");
    	MimetypesFileTypeMap.put(".rat","application/rat-file");
    	MimetypesFileTypeMap.put(".rec","application/vnd.rn-recording");
    	MimetypesFileTypeMap.put(".rgb","application/x-rgb");
    	MimetypesFileTypeMap.put(".rjt","application/vnd.rn-realsystem-rjt");
    	MimetypesFileTypeMap.put(".rle","application/x-rle");
    	MimetypesFileTypeMap.put(".rmf","application/vnd.adobe.rmf");
    	MimetypesFileTypeMap.put(".rmj","application/vnd.rn-realsystem-rmj");
    	MimetypesFileTypeMap.put(".rmp","application/vnd.rn-rn_music_package");
    	MimetypesFileTypeMap.put(".rmvb","application/vnd.rn-realmedia-vbr");
    	MimetypesFileTypeMap.put(".rnx","application/vnd.rn-realplayer");
    	MimetypesFileTypeMap.put(".rpm","audio/x-pn-realaudio-plugin");
    	MimetypesFileTypeMap.put(".rt","text/vnd.rn-realtext");
    	MimetypesFileTypeMap.put(".rtf","application/x-rtf");
    	MimetypesFileTypeMap.put(".sam","application/x-sam");
    	MimetypesFileTypeMap.put(".sdp","application/sdp");
    	MimetypesFileTypeMap.put(".sit","application/x-stuffit");
    	MimetypesFileTypeMap.put(".sld","application/x-sld");
    	MimetypesFileTypeMap.put(".smi","application/smil");
    	MimetypesFileTypeMap.put(".smk","application/x-smk");
    	MimetypesFileTypeMap.put(".sol","text/plain");
    	MimetypesFileTypeMap.put(".spc","application/x-pkcs7-certificates");
    	MimetypesFileTypeMap.put(".spp","text/xml");
    	MimetypesFileTypeMap.put(".sst","application/vnd.ms-pki.certstore");
    	MimetypesFileTypeMap.put(".stm","text/html");
    	MimetypesFileTypeMap.put(".svg","text/xml");
    	MimetypesFileTypeMap.put(".tdf","application/x-tdf");
    	MimetypesFileTypeMap.put(".tga","application/x-tga");
    	MimetypesFileTypeMap.put(".tif","application/x-tif");
    	MimetypesFileTypeMap.put(".tld","text/xml");
    	MimetypesFileTypeMap.put(".torrent","application/x-bittorrent");
    	MimetypesFileTypeMap.put(".txt","text/plain");
    	MimetypesFileTypeMap.put(".uls","text/iuls");
    	MimetypesFileTypeMap.put(".vda","application/x-vda");
    	MimetypesFileTypeMap.put(".vml","text/xml");
    	MimetypesFileTypeMap.put(".vsd","application/vnd.visio");
    	MimetypesFileTypeMap.put(".vss","application/vnd.visio");
    	MimetypesFileTypeMap.put(".vst","application/x-vst");
    	MimetypesFileTypeMap.put(".vsx","application/vnd.visio");
    	MimetypesFileTypeMap.put(".vxml","text/xml");
    	MimetypesFileTypeMap.put(".wax","audio/x-ms-wax");
    	MimetypesFileTypeMap.put(".wb2","application/x-wb2");
    	MimetypesFileTypeMap.put(".wbmp","image/vnd.wap.wbmp");
    	MimetypesFileTypeMap.put(".wk3","application/x-wk3");
    	MimetypesFileTypeMap.put(".wkq","application/x-wkq");
    	MimetypesFileTypeMap.put(".wm","video/x-ms-wm");
    	MimetypesFileTypeMap.put(".wmd","application/x-ms-wmd");
    	MimetypesFileTypeMap.put(".wml","text/vnd.wap.wml");
    	MimetypesFileTypeMap.put(".wmx","video/x-ms-wmx");
    	MimetypesFileTypeMap.put(".wp6","application/x-wp6");
    	MimetypesFileTypeMap.put(".wpg","application/x-wpg");
    	MimetypesFileTypeMap.put(".wq1","application/x-wq1");
    	MimetypesFileTypeMap.put(".wri","application/x-wri");
    	MimetypesFileTypeMap.put(".ws","application/x-ws");
    	MimetypesFileTypeMap.put(".wsc","text/scriptlet");
    	MimetypesFileTypeMap.put(".wvx","video/x-ms-wvx");
    	MimetypesFileTypeMap.put(".xdr","text/xml");
    	MimetypesFileTypeMap.put(".xfdf","application/vnd.adobe.xfdf");
    	MimetypesFileTypeMap.put(".xls","application/vnd.ms-excel");
    	MimetypesFileTypeMap.put(".xlw","application/x-xlw");
    	MimetypesFileTypeMap.put(".xpl","audio/scpls");
    	MimetypesFileTypeMap.put(".xql","text/xml");
    	MimetypesFileTypeMap.put(".xsd","text/xml");
    	MimetypesFileTypeMap.put(".xslt","text/xml");
    	MimetypesFileTypeMap.put(".x_b","application/x-x_b");
    	MimetypesFileTypeMap.put(".sisx","application/vnd.symbian.install");
    	MimetypesFileTypeMap.put(".ipa","application/vnd.iphone");
    	MimetypesFileTypeMap.put(".xap","application/x-silverlight-app");
    }
    
}
