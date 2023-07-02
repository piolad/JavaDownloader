//if(args.length != 0){
//        //do stuff with args
//        }
//        else{
//        String urltxt = "https://gosafir.com/mag/wp-content/uploads/2019/12/Tolkien-J.-The-lord-of-the-rings-HarperCollins-ebooks-2010.pdf#23";
//
//
//        URL url = new URL(urltxt);
//
//
//        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
//        httpConnection.setRequestMethod("HEAD");
//
//        String filename = Paths.get(url.getFile()).getFileName().toString();
//
//
//
//
//
//        long removeFileSize = httpConnection.getContentLengthLong();
//
//        System.out.println("response code " + httpConnection.getResponseCode());
//        System.out.println("File size: " + removeFileSize);
//
//        System.out.println("filename: " + filename);
//
//        String fieldValue = httpConnection.getHeaderField("Content-Disposition");
//
//        System.out.println("==================================");
//        httpConnection.getHeaderFields().forEach((k, v) -> System.out.println(k + ": " + v));
//
//
//        System.out.println("File name: " + filename);
//
//
//
//        File file = new File("", filename);
//        long filelen = 0;
//        if(file.exists()){
//        System.out.println("File exists");
//        filelen = file.length();
//        System.out.println("File length: " + filelen);
//        httpConnection.setRequestProperty("Range", "bytes=" + filelen + "-");
//        }
//
//
//        if(filelen < removeFileSize) {
//        System.out.println("File is not complete");
//
//        OutputStream os = new FileOutputStream(filename, true);
//
//
//        BufferedInputStream in = new BufferedInputStream(url.openStream());
//        byte dataBuffer[] = new byte[1024];
//        int bytesRead;
//        while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
//        os.write(dataBuffer, 0, bytesRead);
//        }
//
//
//        in.close();
//        }
//
//
//
//
//        System.out.println("File size: " + removeFileSize);
//        System.out.println("File name: " + filename);
//
//        }