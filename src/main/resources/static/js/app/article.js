$(function () {
    // $('#example1').DataTable();
    // $('#example2').DataTable({
    //   'paging'      : true,
    //   'lengthChange': false,
    //   'searching'   : false,
    //   'ordering'    : true,
    //   'info'        : true,
    //   'autoWidth'   : false
    // });
    alert(123);
    $('#example2').DataTable( {
        "processing": true,
        "serverSide": true,
        "ajax": "article/getArticles"
    } );
})
