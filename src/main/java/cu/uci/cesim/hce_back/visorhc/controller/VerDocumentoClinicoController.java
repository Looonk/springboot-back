package cu.uci.cesim.hce_back.visorhc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = {"http://locahost:4200/"})
@RestController
@RequestMapping("/ehr/")
public class VerDocumentoClinicoController {

    @Autowired
    private Environment env;

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity CDA() {

        String xml = "";
        try {
            String HL7_CDA_PATH = env.getProperty("HL7_CDA_PATH");
            List<String> content = Files.readAllLines(Paths.get(HL7_CDA_PATH + "\\2.16.840.1.113883.3.299.1.1001000000000001942.3.1.1001000000003316362\\2.16.840.1.113883.3.299.1.1001000000000001948.1.202111021147368.xml"));
            xml = content.stream()
                    .map(n -> n.toString())
                    .collect(Collectors.joining("\n"));
        } catch (Exception e) {
        }

        return ResponseEntity.ok(xml);

    }

    @RequestMapping(path = "/es_CU/CDA.xsl", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity CDAXsl() {

        String xml = "";
        try {

            Resource resource = new ClassPathResource("xsl/CDA.xsl");

            List<String> content = Files.readAllLines(resource.getFile().toPath());
            xml = content.stream()
                    .map(n -> n.toString())
                    .collect(Collectors.joining(System.lineSeparator()));
        } catch (Exception e) {
        }

        return ResponseEntity.ok(xml);

    }

    @RequestMapping(path = "/str/", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String CDAStr() {
        String HL7_CDA_PATH = env.getProperty("HL7_CDA_PATH");

        String xml = "";
        try {

            List<String> content = Files.readAllLines(Paths.get(HL7_CDA_PATH + "\\2.16.840.1.113883.3.299.1.1001000000000001942.3.1.1001000000003316362\\2.16.840.1.113883.3.299.1.1001000000000001948.1.202111021147368.xml"));
            xml = content.stream()
                    .map(n -> n.toString())
                    .collect(Collectors.joining(System.lineSeparator()));
        } catch (Exception e) {
        }

        return xml;

    }


    @RequestMapping(path = "/download/", method = RequestMethod.GET, produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<Resource> CDADownload() {

        String HL7_CDA_PATH = env.getProperty("HL7_CDA_PATH");
        File file = null;
        HttpHeaders headers = null;
        InputStreamResource resource = null;
        try {
            file = new File(HL7_CDA_PATH + "\\2.16.840.1.113883.3.299.1.1001000000000001942.3.1.1001000000003316362\\2.16.840.1.113883.3.299.1.1001000000000001948.1.202111021147368.xml");
            resource = new InputStreamResource(new FileInputStream(file));
            headers = new HttpHeaders();
            headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
            headers.add("Pragma", "no-cache");
            headers.add("Expires", "0");
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=CDA.xml");
        } catch (Exception e) {
        }

        return ResponseEntity.ok().headers(headers).contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(resource);

    }
}
